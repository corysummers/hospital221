/*
	Cory Daniel
	CSC 221
	Program 04
	April 15, 2015
*/

public class HospitalProgram {
	
	public static void main(String[] args) {
		// Test Person
		Person john = new Person();
		john.setFirstName("John");
		john.setLastName("Cena");
		System.out.println(john.toString());
		System.out.println();
		
		// Test Doctor
		Doctor zhivago = new Doctor();
		zhivago.setName("Logarius", "Zhivago");
		zhivago.setSpecialty("Bridges");
		System.out.println(zhivago.toString());
		System.out.println();
		
		Doctor mccoy = new Doctor("Leonard", "McCoy", "Damn it, Jim");
		System.out.println(mccoy.toString());
		System.out.println();
		
		// Test patient
		Patient pat = new Patient("Patrick", "Stewart", "NC1071", zhivago, 8, 31, 1988, 4, 7, 15, 4, 8, 15, 1000, 150, 400);
		System.out.println(pat.toString());
		System.out.println();
		
		Patient kirk = new Patient();
		System.out.println(kirk.toString());
		System.out.println();
		
		kirk.setName("James", "Kirk");
		kirk.setId("NCCNCNCN");
		kirk.setDob(2, 14, 1969);
		kirk.setAdmitted(12, 24, 2001);
		kirk.setDischarged(12, 25, 2002);
		kirk.setAttPhysician(mccoy);
		kirk.setBill(500, 35, 100);
		
		System.out.println(kirk.toString());
		System.out.println();
	}
}