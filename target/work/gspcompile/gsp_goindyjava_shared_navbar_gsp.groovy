import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_goindyjava_shared_navbar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shared/_navbar.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(createLink(controller: 'main', action: 'index'))
printHtmlPart(1)
if(true && (section == "about")) {
printHtmlPart(2)
}
else {
printHtmlPart(3)
}
printHtmlPart(4)
expressionOut.print(createLink(controller: 'about', action: 'index'))
printHtmlPart(5)
if(true && (section == "restaurants")) {
printHtmlPart(2)
}
else {
printHtmlPart(3)
}
printHtmlPart(6)
expressionOut.print(createLink(controller: 'restaurants', action: 'index'))
printHtmlPart(7)
expressionOut.print(createLink(controller: 'restaurants', action: 'breakfast'))
printHtmlPart(8)
expressionOut.print(createLink(controller: 'restaurants', action: 'lunch'))
printHtmlPart(9)
expressionOut.print(createLink(controller: 'restaurants', action: 'dinner'))
printHtmlPart(10)
expressionOut.print(createLink(controller: 'restaurants', action: 'dessert'))
printHtmlPart(11)
if(true && (section == "lodging")) {
printHtmlPart(2)
}
else {
printHtmlPart(3)
}
printHtmlPart(12)
expressionOut.print(createLink(controller: 'lodgings', action: 'index'))
printHtmlPart(13)
expressionOut.print(createLink(controller: 'lodgings', action: 'bnb'))
printHtmlPart(14)
expressionOut.print(createLink(controller: 'lodgings', action: 'hotel'))
printHtmlPart(15)
expressionOut.print(createLink(controller: 'lodgings', action: 'camping'))
printHtmlPart(16)
if(true && (section == "activities")) {
printHtmlPart(2)
}
else {
printHtmlPart(3)
}
printHtmlPart(17)
expressionOut.print(createLink(controller: 'activities'))
printHtmlPart(18)
expressionOut.print(createLink(controller: 'activities', action: 'family'))
printHtmlPart(19)
expressionOut.print(createLink(controller: 'activities', action: 'theatre'))
printHtmlPart(20)
expressionOut.print(createLink(controller: 'activities', action: 'music'))
printHtmlPart(21)
expressionOut.print(createLink(controller: 'activities', action: 'sports'))
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1411062778000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
