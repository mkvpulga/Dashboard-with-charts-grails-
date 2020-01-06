import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_MBPHILDashboard_homeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/home/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(5)
createTagBody(3, {->
printHtmlPart(6)
expressionOut.print(createLink(controller:'home', action:'loanByPerformanceId'))
printHtmlPart(7)
expressionOut.print(createLink(controller:'home', action:'loanByProject'))
printHtmlPart(8)
expressionOut.print(createLink(controller:'home', action:'depositByType'))
printHtmlPart(9)
expressionOut.print(createLink(controller:'home', action:'totalDepositsPerMonth'))
printHtmlPart(10)
expressionOut.print(createLink(controller:'home', action:'totalLoansPerMonth'))
printHtmlPart(11)
expressionOut.print(createLink(controller:'home', action:'totalPastDueLoansPerMonth'))
printHtmlPart(12)
expressionOut.print(createLink(controller:'home', action:'netWorthPerMonth'))
printHtmlPart(13)
})
invokeTag('javascript','g',276,[:],3)
printHtmlPart(14)
})
invokeTag('captureContent','sitemesh',400,['tag':("main-content")],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',402,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1575443300450L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
