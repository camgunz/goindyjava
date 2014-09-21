package goindyjava

class Restaurant {
	RestaurantType type
	String image
	String name
	String heading
	String description
	
	static mapping = {
		table 'restaurants'
		type column: 'type'
		image column: 'image'
		name column: 'name'
		heading column: 'heading'
		description column: 'description'
		description type: 'text'
	}
	
	public String toString() {
		return name;
	}
}
