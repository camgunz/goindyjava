package goindyjava

class RestaurantsController {

    def index() {
		render(view: "/columns", model: [
			title: "Restaurants",
			section: "restaurants",
			columns: RestaurantType.list(sort: "id")
		])
	}
	
	def breakfast() {
		def rType = RestaurantType.findByName("breakfast")
		def restaurants = Restaurant.findAllByType(rType)

		render(view: "/columns", model: [
			title: rType.heading,
			section: "restaurants",
			columns: restaurants
		])
	}
	
	def lunch() {
		def rType = RestaurantType.findByName("lunch")
		def restaurants = Restaurant.findAllByType(rType)

		render(view: "/columns", model: [
			title: rType.heading,
			section: "restaurants",
			columns: restaurants
		])
	}

	def dinner() {
		def rType = RestaurantType.findByName("dinner")
		def restaurants = Restaurant.findAllByType(rType)

		render(view: "/columns", model: [
			title: rType.heading,
			section: "restaurants",
			columns: restaurants
		])
	}

	def dessert() {
		def rType = RestaurantType.findByName("dessert")
		def restaurants = Restaurant.findAllByType(rType)

		render(view: "/columns", model: [
			title: rType.heading,
			section: "restaurants",
			columns: restaurants
		])
	}
}
