package oop_Encapsulation;

public class Employee {

	//private class variables
	private String name;
	private int age;
	private boolean isPermanent;
	
	//Encapsulation: capsule the data-- i.e. all private data information is present in one capsule
	//we create a public layer to access private properties using setters and getters
			
	//constructor: to create an object we create constructor
	public Employee(String name, int age, boolean isPermanent) {
		this.name = name;
		this.age = age;
		this.isPermanent = isPermanent;

	} 
	
	//here constructor and setter are doing same job. it is not mandatory to write setters when constructor is defined
	//but setters should be given in order to update the value 
	
	//getter method is retrieving data
	//setter method is to update the data

	//Getter and Setter: 
		
	public String getName() { //getters are designed with return type
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isPermanent() {
		return isPermanent;
	}
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	
	


}
