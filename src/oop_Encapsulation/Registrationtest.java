package oop_Encapsulation;

public class Registrationtest {

	public static void main(String[] args) {
		

	//	Registration reg = new Registration(); // we cannot create object because we do not have default constructor
		
		//reg page
		Registration reg = new Registration("Kavya", "kavya@gmail.com");
		
		//go to profile page:
		System.out.println(reg.getFirstName()+ " " + reg.getEmail());
		System.out.println(reg.getLastName()+ " " +reg.getPassword() + " " +reg.getPhoneNumber());
	
		//update information in profile page:
		reg.setLastName("Sudha");
		reg.setPassword("Sudha@123");
		reg.setPhoneNumber("98989444");
		
		System.out.println(reg.getFirstName()+ " " + reg.getEmail());
		System.out.println(reg.getLastName()+ " " +reg.getPassword() + " " +reg.getPhoneNumber());
	
		
	//here instead of creating another object with all parameters , it is good to update rest of the values using setters
	//	Registration reg = new Registration(null, null, null, null, null); //unnecessary object is getting created
				
		
	
	
	}

}
