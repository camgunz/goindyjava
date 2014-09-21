package goindyjava

import grails.converters.*

class DumpController {

    def activity_types() {
		render ActivityType.list() as JSON
	}
	
	def activities() {
		render Activity.list() as JSON
	}
	
	def lodging_types() {
		render LodgingType.list() as JSON
	}
	
	def lodgings() {
		render Lodging.list() as JSON
	}
	
	def restaurant_types() {
		render RestaurantType.list() as JSON
	}
	
	def restaurants() {
		render Restaurant.list() as JSON
	}
	
	def home_slides() {
		render HomeSlide.list() as JSON
	}
}
