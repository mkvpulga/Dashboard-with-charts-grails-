import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_MBPHILDashboard_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("UTF-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',5,[:],-1)
printHtmlPart(2)
})
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"),'name':("viewport")],-1)
printHtmlPart(3)
invokeTag('stylesheet','asset',11,['src':("bootstrap.min.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',13,['src':("font-awesome.min.css")],-1)
printHtmlPart(5)
invokeTag('stylesheet','asset',15,['src':("nprogress.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',17,['src':("green.css")],-1)
printHtmlPart(6)
invokeTag('stylesheet','asset',19,['src':("bootstrap-progressbar-3.3.4.min.css")],-1)
printHtmlPart(4)
invokeTag('stylesheet','asset',21,['src':("jqvmap.min.css")],-1)
printHtmlPart(6)
invokeTag('stylesheet','asset',23,['src':("daterangepicker.css")],-1)
printHtmlPart(7)
invokeTag('stylesheet','asset',25,['src':("custom.min.css")],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',27,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(8)
invokeTag('createLink','g',46,['url':([action:'index',controller:'home'])],-1)
printHtmlPart(9)
invokeTag('createLink','g',48,['url':([action:'index',controller:'financialInfo'])],-1)
printHtmlPart(10)
invokeTag('createLink','g',51,['url':([action:'index',controller:'depositOperation'])],-1)
printHtmlPart(11)
invokeTag('createLink','g',53,['url':([action:'index',controller:'loanOperation'])],-1)
printHtmlPart(12)
invokeTag('createLink','g',53,['url':([action:'index',controller:'txnCash'])],-1)
printHtmlPart(13)
if(true && (pageProperty(name:'title')!='')) {
printHtmlPart(14)
invokeTag('layoutTitle','g',87,[:],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (flash.error)) {
printHtmlPart(17)
expressionOut.print(flash.error)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('pageProperty','g',107,['name':("page.main-content")],-1)
printHtmlPart(20)
if(true && (pageProperty(name:'page.main-actions')!='')) {
printHtmlPart(21)
invokeTag('pageProperty','g',113,['name':("page.main-actions")],-1)
printHtmlPart(22)
}
printHtmlPart(23)
invokeTag('javascript','asset',131,['src':("jquery.min.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',134,['src':("bootstrap.min.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',136,['src':("fastclick.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',137,['src':("nprogress.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',137,['src':("Chart.min.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',138,['src':("gauge.min.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',141,['src':("bootstrap-progressbar.min.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',143,['src':("icheck.min.js")],-1)
printHtmlPart(25)
invokeTag('javascript','asset',146,['src':("skycons.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',147,['src':("jquery.flot.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',148,['src':("jquery.flot.pie.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',149,['src':("jquery.flot.time.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',150,['src':("jquery.flot.stack.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',152,['src':("jquery.flot.resize.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',153,['src':("jquery.flot.orderBars.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',156,['src':("jquery.flot.spline.min.js")],-1)
printHtmlPart(26)
invokeTag('javascript','asset',157,['src':("curvedLines.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',158,['src':("date.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',159,['src':(".vmap.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',160,['src':("jquery.vmap.world.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',161,['src':("jquery.vmap.sampledata.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',161,['src':("moment.min.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',162,['src':("daterangepicker.js")],-1)
printHtmlPart(24)
invokeTag('javascript','asset',163,['src':("custom.min.js")],-1)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',168,['class':("nav-md")],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1575442827066L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
