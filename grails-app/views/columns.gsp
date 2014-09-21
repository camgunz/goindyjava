<!DOCTYPE html>
<html lang="en">
<g:render template="/shared/head" model="[title=title]"/>
<body>
	<g:render template="/shared/navbar" model="[section=section]"/>
	<div id="columns_jumbotron" class="jumbotron">
        <h1>${title}</h1>
    </div>
    <div class="container-fluid">
    	<div class="row">
		    <g:set var="columnClass" value="${'column'}"/>
		    <g:if test="${columns.size() == 2}">
		        <g:set var="columnClass" value="${'col-sm-6 column'}"/>
		    </g:if>
		    <g:elseif test="${columns.size() == 3}">
		        <g:set var="columnClass" value="${'col-sm-4 column'}"/>
		    </g:elseif>
		    <g:elseif test="${columns.size() == 4}">
		        <g:set var="columnClass" value="${'col-sm-3 column'}"/>
		    </g:elseif>
		    <g:else>
		        <g:set var="columnClass" value="${'column'}"/>
		    </g:else>
		    <g:each in="${columns}" var="column">
		        <div class="${columnClass}">
		            <p><asset:image src="${column.image}"/></p>
		            <h2>${column.heading}</h2>
		            <p>${column.description}</p>
		        </div>
		    </g:each>
		</div>
	</div>
</body>
</html>