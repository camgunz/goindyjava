class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/index.gsp"(redirect: [controller: 'main', action: 'index', permanent: true])

        "500"(view: "/error")
	}
}
