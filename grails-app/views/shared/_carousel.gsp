<div id="main-carousel" class="carousel slide" data-ride="carousel"
     data-interval="20000">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <g:set var="slideIndex" value="${0}"/>
        <g:while test="${slideIndex < slides.size()}">
            <g:if test="${slideIndex == 0}">
                <li data-target="#main-carousel"
                    data-slide-to="${slideIndex++}"
                    class="active"></li>
            </g:if>
            <g:else>
                <li data-target="#main-carousel"
                    data-slide-to="${slideIndex++}"></li>
            </g:else>
        </g:while>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
        <g:set var="slideIndex" value="${0}"/>
        <g:while test="${slideIndex < slides.size()}">
            <g:set var="slide" value="${slides[slideIndex]}"/>
            <g:if test="${slideIndex++ == 0}">
                <div class="item active">
                    <asset:image src="${slide.image}"/>
                    <div class="carousel-caption rounded shaded">
                        <h1>${slide.heading}</h1>
                        <g:if test="${slide.subheading != null}">
                            <h2>${slide.subheading}</h2>
                        </g:if>
                        <p>${slide.contents}</p>
                    </div>            	
                </div>
            </g:if>
            <g:else>
                <div class="item">
                    <asset:image src="${slide.image}"/>
                    <div class="carousel-caption rounded shaded">
                        <h1>${slide.heading}</h1>
                        <g:if test="${slide.subheading != null}">
                            <h2>${slide.subheading}</h2>
                        </g:if>
                        <p>${slide.contents}</p>
                    </div>            	
                </div>
            </g:else>
        </g:while>
    </div>

    <!-- Controls -->
    <a class="left carousel-control" href="#main-carousel"
       role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left"></span>
    </a>
    <a class="right carousel-control" href="#main-carousel"
       role="button" data-slide="next">
       <span class="glyphicon glyphicon-chevron-right"></span>
    </a>
</div>
