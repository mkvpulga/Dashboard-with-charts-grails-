package admin

import groovy.json.JsonBuilder
import grails.converters.*
import grails.transaction.Transactional
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import groovy.time.TimeCategory
import groovy.sql.Sql

class CashController {
    
    def dataSource
   
    def data_1() {             
        def cols = []     
        def rows = []     
        def db = new Sql(dataSource)
        def sqlstmt  = "select B.username, count(*) as txn " +
"from txn_file A " +
"inner join user_master B on A.user_id = B.id " +
"where A.txn_date = (select run_date from branch where id = 1) " +
"group by B.username"
// def sqlstmt  = "select account_no as username, id as txn from loan limit 100"
        def chartData = db.rows(sqlstmt)
        for (datum in chartData){
            cols.add(datum.username)
            rows.add(datum.txn)
        }
        def data = [cols: cols, rows: rows]
       
        println(data);
        render(data as JSON)
        println('data_1');
    }
}

