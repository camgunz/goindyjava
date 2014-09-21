import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_goindyjava_mainindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/main/index.gsp" }
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
invokeTag('render','g',7,['template':("/shared/carousel"),'model':([slides=homeSlides])],-1)
printHtmlPart(4)
for( slide in (homeSlides) ) {
printHtmlPart(5)
expressionOut.print(slide.heading)
printHtmlPart(6)
if(true && (slide.subheading != null)) {
printHtmlPart(7)
expressionOut.print(slide.subheading)
printHtmlPart(8)
}
printHtmlPart(9)
expressionOut.print(slide.contents)
printHtmlPart(10)
}
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',22,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1411056986000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
