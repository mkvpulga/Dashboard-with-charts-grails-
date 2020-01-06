<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main">
        <title>Home</title>
    </head>
  <body>
        <content tag="main-content">
        
         <g:javascript>
             window.onload = function() {             
  displayCharts();
};
              function displayCharts(){   
              totalDepositsPerMonth();
              totalLoansPerMonth();
              totalPastDueLoansPerMonth();
              netWorthPerMonth();
              loanByPerformanceId();
              loanByProject();
              depositByType();              
              }
            function loanByPerformanceId(){            
                $.ajax({
                    type: "POST",
                    contentType: "application/json",
                    url: "${createLink(controller:'home', action:'loanByPerformanceId')}",
                    data: '',

                    success: function(data){
                        createPieChart(data, 'loanByPerformanceIdPieChart');
                    },
                    error: function(data){

                    },

                });
            }
            function loanByProject(){            
                $.ajax({
                    type: "POST",
                    contentType: "application/json",
                    url: "${createLink(controller:'home', action:'loanByProject')}",
                    data: '',

                    success: function(data){
                        createPieChart(data, 'loanByProjectPieChart');
                    },
                    error: function(data){

                    },

                });
            }
            function depositByType(){            
                $.ajax({
                    type: "POST",
                    contentType: "application/json",
                    url: "${createLink(controller:'home', action:'depositByType')}",
                    data: '',

                    success: function(data){
                        createPieChart(data, 'depositByTypePieChart');
                    },
                    error: function(data){

                    },

                });
            }
            
            function totalDepositsPerMonth(){            
                $.ajax({
                    type: "POST",
                    contentType: "application/json",
                    url: "${createLink(controller:'home', action:'totalDepositsPerMonth')}",
                    data: '',

                    success: function(data){
                        createBarChart(data, 'totalDepositsPerMonthBarChart');
                    },
                    error: function(data){

                    },

                });
            }
            
            function totalLoansPerMonth(){            
                $.ajax({
                    type: "POST",
                    contentType: "application/json",
                    url: "${createLink(controller:'home', action:'totalLoansPerMonth')}",
                    data: '',

                    success: function(data){
                        createBarChart(data, 'totalLoansPerMonthBarChart');
                    },
                    error: function(data){

                    },

                });
            }
            
            function totalPastDueLoansPerMonth(){            
                $.ajax({
                    type: "POST",
                    contentType: "application/json",
                    url: "${createLink(controller:'home', action:'totalPastDueLoansPerMonth')}",
                    data: '',

                    success: function(data){
                        createLineChart(data, 'totalPastDueLoansPerMonthLineChart');
                    },
                    error: function(data){

                    },

                });
            }
            
            function netWorthPerMonth(){            
                $.ajax({
                    type: "POST",
                    contentType: "application/json",
                    url: "${createLink(controller:'home', action:'netWorthPerMonth')}",
                    data: '',

                    success: function(data){
                        createLineChart(data, 'netWorthPerMonthLineChart');
                    },
                    error: function(data){

                    },

                });
            }
            function createLineChart(data , pointer) {
                console.log("========== CREATE CHART ===========");
                 
                console.log("data: "+data);
                
                var label_ito = [];
                var data_ito = [];
                var kulay_ito = [];
                
                for (var i = 0; i < data.cols.length ; i++) {
                    label_ito.push(data.cols[i]);           
                } 
                for (var i = 0; i < data.rows.length ; i++) {
                    data_ito.push(data.rows[i]);  
                    kulay_ito.push(getRandomColor());  
                } 

            //=========================LINE CHART===================
            
            var lineChart = new Chart(document.getElementById(pointer), {
                type: 'line',
                data: {   
                    labels: label_ito,
                    datasets: [{
                        label: 'Total Per Month',
                        borderColor: "blue",
                        data: data_ito,
                        fill: false
                    }]
                },options: {        
                responsive: true,
                    maintainAspectRatio: false
                }
            });
            
                var xAxisLabelMinWidth = 15; // Replace this with whatever value you like
                var chartCanvas = document.getElementById('lineChart');
                var maxWidth = chartCanvas.parentElement.clientWidth;
                var width = Math.max(lineChart.data.labels.length * xAxisLabelMinWidth, maxWidth);

                chartCanvas.parentElement.style.width = width +'px';
                console.log('chart created');
            }
            
            function createBarChart(data, pointer) {
                console.log("========== CREATE BAR CHART ===========");
                 
                console.log("data: "+data);
                
                var label_ito = [];
                var data_ito = [];
                var kulay_ito = [];
                
                for (var i = 0; i < data.cols.length ; i++) {
                    label_ito.push(data.cols[i]);           
                } 
                for (var i = 0; i < data.rows.length ; i++) {
                    data_ito.push(data.rows[i]);  
                    kulay_ito.push(getRandomColor());  
                } 

            //=========================BAR CHART===================
            
            var barChart = new Chart(document.getElementById(pointer), {
                type: 'bar',
                data: {   
                    labels: label_ito,
                    datasets: [{
                        label: 'Total Per Month',
                        backgroundColor: "blue",
                        data: data_ito,
                      
                    }]
                },options: {            
                responsive: true,
                    maintainAspectRatio: false
                }
            });
            
                var xAxisLabelMinWidth = 15; // Replace this with whatever value you like
                var chartCanvas = document.getElementById('barChart');
                var maxWidth = chartCanvas.parentElement.clientWidth;
                var width = Math.max(barChart.data.labels.length * xAxisLabelMinWidth, maxWidth);

                chartCanvas.parentElement.style.width = width +'px';
                console.log('chart created');
            }
            
            
            function createPieChart(data, pointer) {
                console.log("========== CREATE CHART ===========");
                 
                console.log("data: "+data);
                
                var label_ito = [];
                var data_ito = [];
                var kulay_ito = [];
                
                for (var i = 0; i < data.cols.length ; i++) {
                    label_ito.push(data.cols[i]);           
                } 
                for (var i = 0; i < data.rows.length ; i++) {
                    data_ito.push(data.rows[i]);  
                    kulay_ito.push(getRandomColor());  
                } 

            //=========================PIE CHART===================
           
            var PieChart = new Chart(document.getElementById(pointer), {
                type: 'pie',
                data: {   
                    labels: label_ito,
                    datasets: [{
                       // label: 'Total ',
                        backgroundColor: kulay_ito,
                        data: data_ito
                    }]
                }
                ,options: {   
                responsive: true,
                   maintainAspectRatio: false
                }
            });
            
                console.log('chart created');
            }


            function getRandomColor() {
                var letters = '0123456789ABCDEF';
                var color = '#';
                for (var i = 0; i < 6; i++) {
                    color += letters[Math.floor(Math.random() * 16)];
                }
                 return color;
            }

        </g:javascript>
                      
                      <button onclick="displayCharts();">Display Charts </button>
                             
        
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="row x_title">
                        <div class="col-md-12">
                            <h3>Total Deposits Per Month <small>Bar Chart</small></h3>
                        </div>
                    </div>                 
                    <div class="chartWrapper">
                        <div class="chartContainer">
                            <canvas id="totalDepositsPerMonthBarChart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
           
<div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="row x_title">
                        <div class="col-md-12">
                            <h3>Total Loans Per Month <small>Bar Chart</small></h3>
                        </div>
                    </div>                 
                    <div class="chartWrapper">
                        <div class="chartContainer">
                            <canvas id="totalLoansPerMonthBarChart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
               
<div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="row x_title">
                        <div class="col-md-12">
                            <h3>Total Past Due Loans Per Month <small>Line Chart</small></h3>
                        </div>
                    </div>                 
                    <div class="chartWrapper">
                        <div class="chartContainer">
                            <canvas id="totalPastDueLoansPerMonthLineChart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="row x_title">
                        <div class="col-md-12">
                            <h3>Net Worth Per Month <small>Line Chart</small></h3>
                        </div>
                    </div>                 
                    <div class="chartWrapper">
                        <div class="chartContainer">
                            <canvas id="netWorthPerMonthLineChart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="row x_title">
                        <div class="col-md-12">
                            <h3>Loan By Performance Id <small>Pie Chart</small></h3>
                        </div>
                    </div>                 
                    <div class="chartWrapper">
                        <div class="chartContainer">
                            <canvas id="loanByPerformanceIdPieChart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
                    
        
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="row x_title">
                        <div class="col-md-12">
                            <h3>Loan By Project <small>Pie Chart</small></h3>
                        </div>
                    </div>                 
                    <div class="chartWrapper">
                        <div class="chartContainer">
                            <canvas id="loanByProjectPieChart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
       
         <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="row x_title">
                        <div class="col-md-12">
                            <h3>Deposit By Type <small>Pie Chart</small></h3>
                        </div>
                    </div>                 
                    <div class="chartWrapper">
                        <div class="chartContainer">
                            <canvas id="depositByTypePieChart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </content>
       
    </body>
</html>
