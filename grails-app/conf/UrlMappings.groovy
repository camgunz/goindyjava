class UrlMappings {

	static mappings = {
        "/"(controller: "/main")

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
        //         apply constraints here
            }
        }

        "500"(view: "/error")
	}
}
