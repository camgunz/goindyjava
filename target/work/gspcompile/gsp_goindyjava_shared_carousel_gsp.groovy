import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_goindyjava_shared_carousel_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shared/_carousel.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('set','g',5,['var':("slideIndex"),'value':(0)],-1)
printHtmlPart(1)
while(slideIndex < slides.size()) {
printHtmlPart(2)
if(true && (slideIndex == 0)) {
printHtmlPart(3)
expressionOut.print(slideIndex++)
printHtmlPart(4)
}
else {
printHtmlPart(3)
expressionOut.print(slideIndex++)
printHtmlPart(5)
}
printHtmlPart(1)
}
printHtmlPart(6)
invokeTag('set','g',21,['var':("slideIndex"),'value':(0)],-1)
printHtmlPart(1)
while(slideIndex < slides.size()) {
printHtmlPart(2)
invokeTag('set','g',23,['var':("slide"),'value':(slides[slideIndex])],-1)
printHtmlPart(2)
if(true && (slideIndex++ == 0)) {
printHtmlPart(7)
invokeTag('image','asset',26,['src':(slide.image)],-1)
printHtmlPart(8)
expressionOut.print(slide.heading)
printHtmlPart(9)
if(true && (slide.subheading != null)) {
printHtmlPart(10)
expressionOut.print(slide.subheading)
printHtmlPart(11)
}
printHtmlPart(12)
expressionOut.print(slide.contents)
printHtmlPart(13)
}
else {
printHtmlPart(14)
invokeTag('image','asset',38,['src':(slide.image)],-1)
printHtmlPart(8)
expressionOut.print(slide.heading)
printHtmlPart(9)
if(true && (slide.subheading != null)) {
printHtmlPart(10)
expressionOut.print(slide.subheading)
printHtmlPart(11)
}
printHtmlPart(12)
expressionOut.print(slide.contents)
printHtmlPart(13)
}
printHtmlPart(1)
}
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1411056655000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
