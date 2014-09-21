package goindyjava

class ActivitiesController {

    def index() {
		render(view: "/columns", model: [
			title: "Activities",
			section: "activities",
			columns: ActivityType.list(sort: "id")
		])
	}
	
	def family() {
		def aType = ActivityType.findByName("family")
		def activities = Activity.findAllByType(aType)

		render(view: "/columns", model: [
			title: aType.heading,
			section: "activities",
			columns: activities
		])
	}
	
	def theatre() {
		def aType = ActivityType.findByName("theatre")
		def activities = Activity.findAllByType(aType)

		render(view: "/columns", model: [
			title: aType.heading,
			section: "activities",
			columns: activities
		])
	}

	def music() {
		def aType = ActivityType.findByName("music")
		def activities = Activity.findAllByType(aType)

		render(view: "/columns", model: [
			title: aType.heading,
			section: "activities",
			columns: activities
		])
	}

	def sports() {
		def aType = ActivityType.findByName("sports")
		def activities = Activity.findAllByType(aType)

		render(view: "/columns", model: [
			title: aType.heading,
			section: "activities",
			columns: activities
		])
	}
}
