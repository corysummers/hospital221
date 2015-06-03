
public class Person {
	// Person variables
	protected String fName, lName;
	
	// Default constructor
	public Person() {
		this.fName = "";
		this.lName = "";
	}
	
	// User defined constructor
	public Person(String f, String l) {
		this.fName = f;
		this.lName = l;
	}
	
	// Set
	public void setFirstName(String f) {
		this.fName = f;
	}
	
	public void setLastName(String l) {
		this.lName = l;
	}
	
	public void setName(String f, String l) {
		this.fName = f;
		this.lName = l;
	}
	
	// Get
	public String getFirstName() {
		return this.fName;
	}
	
	public String getLastName() {
		return this.lName;
	}
	
	// toString
	public String toString() {
		return fName + " " + lName;
	}
}
