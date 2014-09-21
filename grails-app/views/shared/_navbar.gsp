<div class="navbar navbar-default navbar-static-top" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse"
              data-target=".navbar-collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand"
         href="${createLink(controller: 'main', action: 'index')}">Go Indy</a>
    </div>
    <div class="navbar-collapse collapse collapsed">
      <ul class="nav navbar-nav">
        <g:if test="${section == "about"}">
        <li class="active">
        </g:if>
        <g:else>
        <li>
        </g:else>
          <a href="${createLink(controller: 'about', action: 'index')}">About</a>
        </li>
        <g:if test="${section == "restaurants"}">
        <li class="active">
        </g:if>
        <g:else>
        <li>
        </g:else>
          <a class="dropdown-toggle" data-toggle="dropdown"
             href="#">Restaurants<b class="caret"></b>
          </a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="${createLink(controller: 'restaurants', action: 'index')}">Restaurants</a></li>
            <li class="divider"></li>
            <li><a href="${createLink(controller: 'restaurants', action: 'breakfast')}">Breakfast</a></li>
            <li><a href="${createLink(controller: 'restaurants', action: 'lunch')}">Lunch</a></li>
            <li><a href="${createLink(controller: 'restaurants', action: 'dinner')}">Dinner</a></li>
            <li><a href="${createLink(controller: 'restaurants', action: 'dessert')}">Dessert</a></li>
          </ul>
        </li>
        <g:if test="${section == "lodging"}">
        <li class="active">
        </g:if>
        <g:else>
        <li>
        </g:else>
          <a class="dropdown-toggle" data-toggle="dropdown"
             href="#">Lodging<b class="caret"></b>
          </a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="${createLink(controller: 'lodgings', action: 'index')}">Lodging</a></li>
            <li class="divider"></li>
            <li><a href="${createLink(controller: 'lodgings', action: 'bnb')}">Bed and Breakfasts</a></li>
            <li><a href="${createLink(controller: 'lodgings', action: 'hotel')}">Hotels</a></li>
            <li><a href="${createLink(controller: 'lodgings', action: 'camping')}">Camping</a></li>
          </ul>
        </li>
        <g:if test="${section == "activities"}">
        <li class="active">
        </g:if>
        <g:else>
        <li>
        </g:else>
          <a class="dropdown-toggle" data-toggle="dropdown"
             href="#">Activities<b class="caret"></b>
          </a>
          <ul class="dropdown-menu" role="menu">
            <li>
              <a href="${createLink(controller: 'activities')}">Activities</a>
            </li>
            <li class="divider"></li>
            <li>
              <a href="${createLink(controller: 'activities', action: 'family')}">Family</a>
            </li>
            <li>
              <a href="${createLink(controller: 'activities', action: 'theatre')}">Theatre</a>
            </li>
            <li>
              <a href="${createLink(controller: 'activities', action: 'music')}">Music</a>
            </li>
            <li>
              <a href="${createLink(controller: 'activities', action: 'sports')}">Sports</a>
            </li>
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li>
          <a href="http://www.discoverfountainsquare.com">Fountain Square</a>
        </li>
        <li>
          <a href="http://www.discoverbroadripplevillage.com">Broad Ripple</a>
        </li>
      </ul>
    </div>
  </div>
</div>

