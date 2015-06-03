
public class Bill {
	// Variables
	String pId;
	double room, medicine, doctorFee;
	
	// Default constructor
	public Bill() {
		room = 0.0;
		medicine = 0.0;
		doctorFee = 0.0;
	}
	
	// User defined constructor
	public Bill(double rm, double md, double df) {
		this.setBill(rm, md, df);
	}
	
	// Set
	public void setBill(double rm, double med, double doc) {
		this.room = rm;
		this.medicine = med;
		this.doctorFee = doc;
	}
	
	// Get
	public double getTotalBill() {
		return (this.room + this.medicine + this.doctorFee);
	}
	
	// toString
	public String toString() {
		return String.format("The total amount due is $%.2f", getTotalBill());
	}
}
