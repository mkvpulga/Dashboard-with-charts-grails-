package admin


import groovy.json.JsonBuilder
import grails.converters.*
import grails.transaction.Transactional
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import groovy.time.TimeCategory
import groovy.sql.Sql
class HomeController {

     def dataSource
    
    def index() {
    }
    
     def loanByPerformanceId() {             
        println("============= loanByPerformanceId =================")
        println("params: "+params)
        
        def cols = []     
        def rows = []     
        def db = new Sql(dataSource)
        def sqlstmt  = "select A.description, round(sum(case when B.balance_amount is null then 0 else B.balance_amount end),2) as totalLoans " +
"from loan_performance_id A " +
"left outer join loan B on A.id = B.loan_performance_id_id " +
"group by A.description"

        println("sqlstmt: "+sqlstmt)
        def chartData = db.rows(sqlstmt)
        println("chartData: "+chartData)
        for (datum in chartData){
            cols.add(datum.description)
            rows.add(datum.totalLoans)
        }
        def data = [cols: cols, rows: rows]
       
        println("data: "+data);
        render(data as JSON)
        
    }
    
    def loanByProject() {             
        println("============= loanByProject=================")
        println("params: "+params)
        
        def cols = []     
        def rows = []     
        def db = new Sql(dataSource)
        def sqlstmt  = "select A.description, round(sum(case when B.balance_amount is null then 0 else B.balance_amount end),2) as totalLoans " +
"from loan_project A " +
"left outer join loan B on A.id = B.loan_project_id " +
"group by A.description"

        println("sqlstmt: "+sqlstmt)
        def chartData = db.rows(sqlstmt)
        println("chartData: "+chartData)
        for (datum in chartData){
            cols.add(datum.description)
            rows.add(datum.totalLoans)
        }
        def data = [cols: cols, rows: rows]
       
        println("data: "+data);
        render(data as JSON)
        
    }
    
    def depositByType() {             
        println("============= depositByType=================")
        println("params: "+params)
        
        def cols = []     
        def rows = []     
        def db = new Sql(dataSource)
        def sqlstmt  = "select A.description, round(sum(case when B.ledger_bal_amt is null then 0 else B.ledger_bal_amt end),2) as totalLoans " +
"from deposit_type A " +
"left outer join deposit B on A.id = B.type_id " +
"group by A.description"

        println("sqlstmt: "+sqlstmt)
        def chartData = db.rows(sqlstmt)
        println("chartData: "+chartData)
        for (datum in chartData){
            cols.add(datum.description)
            rows.add(datum.totalLoans)
        }
        def data = [cols: cols, rows: rows]
       
        println("data: "+data);
        render(data as JSON)
        
    }
    
    
     def totalDepositsPerMonth() {             
        println("============= totalDepositsPerMonth=================")
        println("params: "+params)
        
        def cols = []     
        def rows = []     
        def db = new Sql(dataSource)
        def sqlstmt  = "with X as ( " +
"select date_trunc('month', ref_date), max(ref_date) as end_date " +
"from daily_balance " +
"group by date_trunc('month', ref_date) " +
"order by date_trunc('month', ref_date) desc limit 12) " +
"select to_char((date_trunc('month', A.ref_date::date) + interval '1 month' - interval '1 day')::date,'month') || ' ' || " +
"to_char((date_trunc('month', A.ref_date::date) + interval '1 month' - interval '1 day')::date,'yyyy') as cut_off, " +
"round(sum(A.closing_bal),2) as tot_dep " +
"from daily_balance A " +
"inner join X on 1 = 1 " +
"where A.ref_date  = X.end_date " +
"group by A.ref_date " +
"order by A.ref_date " 

        println("sqlstmt: "+sqlstmt)
        def chartData = db.rows(sqlstmt)
        println("chartData: "+chartData)
        for (datum in chartData){
            cols.add(datum.cut_off)
            rows.add(datum.tot_dep)
        }
        def data = [cols: cols, rows: rows]
       
        println("data: "+data);
        render(data as JSON)
        
    }
    
     
    def totalLoansPerMonth() {             
        println("============= totalLoansPerMonth=================")
        println("params: "+params)
        
        def cols = []     
        def rows = []     
        def db = new Sql(dataSource)
        def sqlstmt  = "with X as ( " +
"select date_trunc('month', ref_date), max(ref_date) as end_date " +
"from monthly_pointer_loan " +
"group by date_trunc('month', ref_date) " +    
"order by date_trunc('month', ref_date) desc limit 12) " +
"select to_char((date_trunc('month', A.ref_date::date) + interval '1 month' - interval '1 day')::date,'month') || ' ' || " +
"to_char((date_trunc('month', A.ref_date::date) + interval '1 month' - interval '1 day')::date,'yyyy') as cut_off, " +
"round(sum(A.balance_amount),2) as tot_ln " +
"from monthly_pointer_loan A " +
"inner join X on 1 = 1 " +
"where A.ref_date  = X.end_date " +
"group by A.ref_date " +
"order by A.ref_date " 

        println("sqlstmt: "+sqlstmt)
        def chartData = db.rows(sqlstmt)
        println("chartData: "+chartData)
        for (datum in chartData){
            cols.add(datum.cut_off)
            rows.add(datum.tot_ln)
        }
        def data = [cols: cols, rows: rows]
       
        println("data: "+data);
        render(data as JSON)
        
    }
    
    def totalPastDueLoansPerMonth() {             
        println("============= totalPastDueLoansPerMonth=================")
        println("params: "+params)
        
        def cols = []     
        def rows = []     
        def db = new Sql(dataSource)
        def sqlstmt  = "with X as ( " +
"select date_trunc('month', ref_date), max(ref_date) as end_date " +
"from monthly_pointer_loan " +
"group by date_trunc('month', ref_date) " +
"order by date_trunc('month', ref_date) desc limit 12) " +
"select to_char((date_trunc('month', A.ref_date::date) + interval '1 month' - interval '1 day')::date,'month') || ' ' || " +
"to_char((date_trunc('month', A.ref_date::date) + interval '1 month' - interval '1 day')::date,'yyyy') as cut_off, " +
"round(sum(A.balance_amount),2) as tot_pd " +
"from monthly_pointer_loan A " +
"inner join X on 1 = 1 " +
"where A.ref_date  = X.end_date and A.loan_performance_id_id in (2,3,4) " +
"group by A.ref_date " +
"order by A.ref_date "

        println("sqlstmt: "+sqlstmt)
        def chartData = db.rows(sqlstmt)
        println("chartData: "+chartData)
        for (datum in chartData){
            cols.add(datum.cut_off)
            rows.add(datum.tot_pd)
        }
        def data = [cols: cols, rows: rows]
       
        println("data: "+data);
        render(data as JSON)
        
    }
    
    def netWorthPerMonth() {             
        println("============= netWorthPerMonth=================")
        println("params: "+params)
        
        def cols = []     
        def rows = []     
        def db = new Sql(dataSource)
        def sqlstmt  = "with X as ( " +
"select date_trunc('month', ref_date) , max(ref_date) as end_date " +
"from gl_daily_file " +
"group by date_trunc('month', ref_date) " +
"order by date_trunc('month', ref_date) desc limit 12) " +
"select to_char((date_trunc('month', X.end_date::date) + interval '1 month' - interval '1 day')::date,'month') || ' ' || " +
"to_char((date_trunc('month', X.end_date::date) + interval '1 month' - interval '1 day')::date,'yyyy') as cut_off, " +
"round(sum(case when A.debit_balance is null then 0 else A.debit_balance end - " +
"case when A.credit_balance is null then 0 else A.credit_balance end),2) as " +
"total_assets " +
"from gl_daily_file A " +
"inner join X on 1 = 1 " +
"where A.ref_Date = X.end_date and substring(A.code from 1 for 1) = '1' " +
"group by X.end_date " +
"order by X.end_date " 

        println("sqlstmt: "+sqlstmt)
        def chartData = db.rows(sqlstmt)
        println("chartData: "+chartData)
        for (datum in chartData){
            cols.add(datum.cut_off)
            rows.add(datum.total_assets)
        }
        def data = [cols: cols, rows: rows]
       
        println("data: "+data);
        render(data as JSON)
        
    }
    
}
