package admin
import groovy.json.JsonBuilder
import grails.converters.*
import grails.transaction.Transactional
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import groovy.time.TimeCategory
import groovy.sql.Sql
class FinancialInfoController {
    def dataSource
    
    def index() {
        
    }
   
    def grossIncome() {             
        println("============= grossIncome =================")
        println("params: "+params)
        
        def cols = []     
        def rows = []     
        def db = new Sql(dataSource)
        def sqlstmt  = "with X as ( "+
        " select date_trunc('month', txn_date) , min(txn_date) as start_date, max(txn_date) as end_date "+
        " from gl_txn_file "+
        " group by date_trunc('month', txn_date) "+    
        " order by date_trunc('month', txn_date) desc limit 12) "+
        " select to_char((date_trunc('month', X.end_date::date) + interval '1 month' - interval '1 day')::date,'month') || ' ' || "+
        " to_char((date_trunc('month', X.end_date::date) + interval '1 month' - interval '1 day')::date,'yyyy') as monthyear"+
        " , round(sum(case when A.credit_amt is null then 0 else A.credit_amt end - "+
        " case when A.debit_amt is null then 0 else A.debit_amt end),2) as "+
        " grossincome "+
        " from gl_txn_file A "+
        " inner join X on 1 = 1 "+
        " where A.txn_Date between X.start_date and X.end_date and substring(A.gl_account_code from 1 for 1) = '5'  "+
        " and batch_particulars not ilike '%EOY Closing Entries%' "+
        " group by X.end_date "+
        " order by X.end_date "

        println("sqlstmt: "+sqlstmt)
        def chartData = db.rows(sqlstmt)
        println("chartData: "+chartData)
        for (datum in chartData){
            cols.add(datum.monthyear)
            rows.add(datum.grossincome)
        }
        def data = [cols: cols, rows: rows]
       
        println("data: "+data);
        render(data as JSON)
        
    }
}
