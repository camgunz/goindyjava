<!DOCTYPE html>
<html lang="en">
<g:render template="/shared/head" model="[title=title]"/>
<body>
	<g:render template="/shared/navbar" model="[section=section]"/>
	<div id="main-flash" class="container-fluid">
	    <g:render template="/shared/carousel" model="[slides=homeSlides]"/>
    </div>
    <div class="container-fluid">
        <div class="row">
        	<g:each in="${homeSlides}" var="slide">
        	    <div class="col-xs-12 hidden-sm hidden-md hidden-lg">
        	        <h1>${slide.heading}</h1>
                    <g:if test="${slide.subheading != null}">
                        <h2>${slide.subheading}</h2>
                    </g:if>
                    <p>${slide.contents}</p>
                </div>
            </g:each>
        </div>
    </div>
</body>
</html>
