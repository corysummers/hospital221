
public class Doctor extends Person {
	// Doctor variables
	private String specialty;
	
	// Default constructor
	public Doctor() {
		super();
		this.specialty = "";
	}
	
	// User defined constructor
	public Doctor(String f, String l, String s) {
		super(f, l);
		this.specialty = s;
	}
	
	// Set
	public void setSpecialty(String s) {
		this.specialty = s;
	}
	
	// Get
	public String getSpecialty() {
		return this.specialty;
	}
	
	// toString
	public String toString() {
		return super.toString() + " (" + this.getSpecialty() + ")";
	}
}
