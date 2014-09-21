package goindyjava

class ActivityType {
	String name
	String image
	String heading
	String description
	
	static mapping = {
		description type: "text"
	}
	
	public String toString() {
		return name;
	}
}
