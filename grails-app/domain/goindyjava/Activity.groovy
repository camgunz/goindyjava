package goindyjava

class Activity {
	ActivityType type
	String image
	String name
	String heading
	String description
	
	static mapping = {
		table 'activities'
		type column: 'type'
		image column: 'image'
		name column: 'name'
		heading column: 'heading'
		description column: 'description'
		description type: 'text'
	}
}
