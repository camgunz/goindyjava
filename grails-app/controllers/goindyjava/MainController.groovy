package goindyjava

class MainController {

    def index() {
		[
			title: "Home",
			section: "",
			homeSlides: HomeSlide.list(sort: "id")
		]
	}
}
