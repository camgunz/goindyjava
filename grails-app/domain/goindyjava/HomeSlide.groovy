package goindyjava

class HomeSlide {
	String image
	String heading
	String subheading
	String contents
	
	static mapping = {
		contents type: "text"
	}
	
	static constraints = {
		subheading nullable: true
	}
}
