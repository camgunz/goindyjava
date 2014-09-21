class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "/main")
		"/about"(controller: "/about")
		"/restaurants"(controller: "/restaurants")
		"/restaurants/breakfast"(controller: "/restaurants", action: "breakfast")
		"/restaurants/lunch"(controller: "/restaurants", action: "lunch")
		"/restaurants/dinner"(controller: "/restaurants", action: "dinner")
		"/restaurants/dessert"(controller: "/restaurants", action: "dessert")
		"/lodging"(controller: "/lodgings")
		"/lodging/bnb"(controller: "/lodgings", action: "bnb")
		"/lodging/hotels"(controller: "/lodgings", action: "hotels")
		"/lodging/camping"(controller: "/lodgings", action: "camping")
		"/activities"(controller: "/activities")
		"/activities/family"(controller: "/activities", action: "family")
		"/activities/theatre"(controller: "/activities", action: "theatre")
		"/activities/music"(controller: "/activities", action: "music")
		"/activities/sports"(controller: "/activities", action: "sports")
		"/db"(view: "/index")
        "500"(view: "/error")
	}
}
