package goindyjava

class LodgingsController {

    def index() {
		render(view: "/columns", model: [
			title: "Lodging",
			section: "lodging",
			columns: LodgingType.list(sort: "id")
		])
	}
	
	def bnb() {
		def lType = LodgingType.findByName("bnb")
		def lodging = Lodging.findAllByType(lType)

		render(view: "/columns", model: [
			title: lType.heading,
			section: "lodging",
			columns: lodging
		])
	}
	
	def hotels() {
		def lType = LodgingType.findByName("hotel")
		def lodging = Lodging.findAllByType(lType)

		render(view: "/columns", model: [
			title: lType.heading,
			section: "lodging",
			columns: lodging
		])
	}

	def camping() {
		def lType = LodgingType.findByName("camping")
		def lodging = Lodging.findAllByType(lType)

		render(view: "/columns", model: [
			title: lType.heading,
			section: "lodging",
			columns: lodging
		])
	}
}
