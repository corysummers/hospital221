
public class Date {
	// Date variables
	private int year, month, day;
	
	// Default constructor
	public Date() {
		this.setDate(1, 1, 1500);
	}
	
	// User defined constructor
	public Date(int m, int d, int y) {
		this.setDate(m, d, y);
	}
	
	// Set
	public void setDate(int m, int d, int y) {
			this.year = y;
			this.month = m;
			this.day = d;
	}
	
	public void setYear(int y) {
		this.year = y;
	}
	
	public void setMonth(int m) {
		this.month = m;
	}
	
	public void setDay(int d) {
		this.day = d;
	}
	
	// Get
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public String toString() {
		return this.month + "/" + this.day + "/" + this.year;
	}
	
}
