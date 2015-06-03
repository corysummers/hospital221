
public class Patient extends Person {
	// Patient variables
	private String id;
	private Doctor attPhysician;
	private Date dob, admitted, discharged;
	private Bill bill;
	
	// Default constructor
	public Patient() {
		super();
		this.id = "";
		this.attPhysician = null;
		dob = new Date(1, 1, 1900);
		admitted = new Date(1, 1, 1900);
		discharged = new Date(1, 1, 1900);
		bill = new Bill(0, 0, 0);
	}
	
	// User defined constructor
	public Patient(String f, String l, String pId, Doctor phys, int bdM, int bdD, int bdY, int adM, int adD, int adY, int dcM, int dcD, int dcY, double rm, double med, double doc) {
		this.setPatientInfo(f, l, pId, phys);
		dob = new Date(bdM, bdD, bdY);
		admitted = new Date(adM, adD, adY);
		discharged = new Date(dcM, dcD, dcY);
		bill = new Bill(rm, med, doc);
	}
	
	// Set
	public void setPatientInfo(String f, String l, String pId, Doctor phys) {
		this.setName(f, l);
		this.setId(pId);
		this.setAttPhysician(phys);
	}
	
	public void setId(String pId) {
		this.id = pId;
	}
	
	public void setAttPhysician(Doctor phys) {
		this.attPhysician = phys;
	}
	
	public void setDob(int bdM, int bdD, int bdY) {
		dob.setDate(bdM, bdD, bdY);
	}
	
	public void setAdmitted(int adM, int adD, int adY) {
		admitted.setDate(adM, adD, adY);
	}
	
	public void setDischarged(int dcM, int dcD, int dcY) {
		discharged.setDate(dcM, dcD, dcY);
	}
	
	public void setBill(int rm, int med, int doc) {
		bill.setBill(rm, med, doc);
	}
	
	// Get
	public String getId() {
		return this.id;
	}
	
	public Date getAdmitted() {
		return this.admitted;
	}
	
	public Date getDischarged() {
		return this.discharged;
	}
	
	public Date getDob() {
		return this.dob;
	}
	
	public Doctor getAttPhysician() {
		return this.attPhysician;
	}
	
	public Bill getBill() {
		return this.bill;
	}
	
	// toString
	public String toString() {
		return super.toString() + " - Attending Physician: " + this.attPhysician + ", ID NO: " + 
		this.getId() + ", DOB: " + this.dob.toString() + ", Date Admitted: " + this.admitted.toString() +
		", Date Discharged: " + this.discharged.toString() + ". " + this.getBill();
	}
}
