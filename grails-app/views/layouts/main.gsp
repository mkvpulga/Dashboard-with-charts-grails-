<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title><g:layoutTitle />[ICBS]</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport' />
   
    
  <asset:stylesheet src="bootstrap.min.css" />

  <asset:stylesheet src="font-awesome.min.css" />
    
  <asset:stylesheet src="nprogress.css" />

  <asset:stylesheet src="green.css" />
  
  <asset:stylesheet src="bootstrap-progressbar-3.3.4.min.css" />

  <asset:stylesheet src="jqvmap.min.css" />
  
  <asset:stylesheet src="daterangepicker.css" />
   
  <asset:stylesheet src="custom.min.css" />
  
  </head>

  <body class="nav-md" >
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
             </div>

            
            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
                  <%--<li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="${createLink(uri:'/cash/index.gsp')}">Cash</a></li>
                      <li><a href="index2.html">Dashboard2</a></li>
                      <li><a href="index3.html">Dashboard3</a></li>
                    </ul>
                  </li> --%>
                    <li><a href="<g:createLink url="[action:'index',controller:'home']" />"><i class="fa fa-institution"></i> Home</a>
                    <li><a href="<g:createLink url="[action:'index',controller:'financialInfo']" />"><i class="fa fa-calculator"></i> Financial Information</a>
                    <li><a href="<g:createLink url="[action:'index',controller:'depositOperation']" />"><i class="fa fa-hand-lizard-o"></i>Deposit Operations</a>
                    <li><a href="<g:createLink url="[action:'index',controller:'loanOperation']" />"><i class="fa fa-suitcase"></i>Loan Operations</a>
                    <li><a href="<g:createLink url="[action:'index',controller:'txnCash']" />"><i class="fa fa-money"></i>Cash Information</a>
                 
                </ul>
              </div>
            

            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              
            </nav>
          </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
           
      <g:if test="${pageProperty(name:'title')!=''}">
        <h1><g:layoutTitle /></h1>
      </g:if>
      <div id="main-content">
        <g:if test="${flash.error}">
            <div class="box-body">
                <div class="alert alert-danger alert-dismissable">
                    <i class="fa fa-exclamation"></i>
                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                    <b>Message</b> <div class="message" role="status">${flash.error}</div>
                </div>
            </div>
        </g:if>

        <g:pageProperty name="page.main-content"/>
      </div>
      <g:if test="${pageProperty(name:'page.main-actions')!=''}">
        <div id="main-actions" class="main-actions" class="hidden-print">
          <div id="sidebar">
            <div class="title">
              Actions
            </div>
            <div class="content" id="ulmenu">
              <g:pageProperty name="page.main-actions"/>
              &nbsp;
            </div>
          </div>
        </div>
      </g:if>
      <div class="breaker"></div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
            Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>
    
										
  <asset:javascript src="jquery.min.js" />  		
  <asset:javascript src="bootstrap.min.js" />  		
  <asset:javascript src="fastclick.js" />  		
  <asset:javascript src="nprogress.js" />  		
  <asset:javascript src="Chart.min.js" />  		
  <asset:javascript src="gauge.min.js" />  		
  <asset:javascript src="bootstrap-progressbar.min.js" />  		
  <asset:javascript src="icheck.min.js" />  
  
  					
  <asset:javascript src="skycons.js" />  		
  <asset:javascript src="jquery.flot.js" />  		
  <asset:javascript src="jquery.flot.pie.js" />  		
  <asset:javascript src="jquery.flot.time.js" />  		
  <asset:javascript src="jquery.flot.stack.js" />  		
  <asset:javascript src="jquery.flot.resize.js" />  		
  <asset:javascript src="jquery.flot.orderBars.js" />  		
  <asset:javascript src="jquery.flot.spline.min.js" />  
  
  
    <asset:javascript src="curvedLines.js" />  		
  <asset:javascript src="date.js" />  		
  <asset:javascript src=".vmap.js" />  		
  <asset:javascript src="jquery.vmap.world.js" />  		
  <asset:javascript src="jquery.vmap.sampledata.js" />  		
  <asset:javascript src="moment.min.js" />  		
  <asset:javascript src="daterangepicker.js" />  		
  <asset:javascript src="custom.min.js" />
<!--  <script>
      Chart.defaults.global.legend = {
      enabled: false
      };
      </script>-->
	
  </body>
</html>
