package oop_Constructor;

public class Customers {

	String name;
	int age;
	String city;
	String phoneNumber;
	
	//WAP:Create a Customers with different combinations:
	//one Customer with name and age, another with name and phone.. etc
	//no default value types of Customer
	
	//method has business logic -- feature
	//in constructor we never define business logic
	//Constructors are independent to each other
	
	
	//1. customer with name combination
	public Customers(String name) { //this is called as Local variable
		this.name = name; //global variable = local variable
	//this.name = Global Variable and name= local variable
	}
	
	public Customers(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public Customers(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	
	public Customers(String name, int age, String city, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		//Customers c1 = new Customers(); //here Customer constructor doesn't have default Constructor
		Customers c1 = new Customers("tom");
		System.out.println(c1.name);
		
		Customers c2 = new Customers("Kavya" , 25);
		System.out.println(c2.name + " " + c2.age);
		

		Customers c3 = new Customers("Venkat", 30, "Vizag", "98989");
		System.out.println(c3.name+ " " +c3.phoneNumber);
		
				
	
	}

}
