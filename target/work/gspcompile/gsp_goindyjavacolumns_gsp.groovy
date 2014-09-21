import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_goindyjavacolumns_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/columns.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('render','g',3,['template':("/shared/head"),'model':([title=title])],-1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('render','g',5,['template':("/shared/navbar"),'model':([section=section])],-1)
printHtmlPart(3)
expressionOut.print(title)
printHtmlPart(4)
invokeTag('set','g',11,['var':("columnClass"),'value':('column')],-1)
printHtmlPart(5)
if(true && (columns.size() == 2)) {
printHtmlPart(6)
invokeTag('set','g',13,['var':("columnClass"),'value':('col-sm-6 column')],-1)
printHtmlPart(5)
}
else if(true && (columns.size() == 3)) {
printHtmlPart(6)
invokeTag('set','g',16,['var':("columnClass"),'value':('col-sm-4 column')],-1)
printHtmlPart(5)
}
else if(true && (columns.size() == 4)) {
printHtmlPart(6)
invokeTag('set','g',19,['var':("columnClass"),'value':('col-sm-3 column')],-1)
printHtmlPart(5)
}
else {
printHtmlPart(6)
invokeTag('set','g',22,['var':("columnClass"),'value':('column')],-1)
printHtmlPart(5)
}
printHtmlPart(5)
for( column in (columns) ) {
printHtmlPart(7)
expressionOut.print(columnClass)
printHtmlPart(8)
invokeTag('image','asset',26,['src':(column.image)],-1)
printHtmlPart(9)
expressionOut.print(column.heading)
printHtmlPart(10)
expressionOut.print(column.description)
printHtmlPart(11)
}
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',33,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1411063323000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
