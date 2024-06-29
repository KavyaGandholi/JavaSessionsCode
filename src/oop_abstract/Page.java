package oop_abstract;

public abstract class Page {
	
	//limitation of abstract class:
	//1. cannot create object of abstract class
	//2. can have abstract + non-abstract methods in abs class
	//3. Abstract methods cannot be final in nature
	//can we create constructor of page Class: YES // so we can create object too
	//Page class object cannot be created but can be called by creating object of child class -- default constructor will be printed
	
	//the preference will be always given to parent class default constructor first and then parameterized constructor
	
	//hidden default constructor will be added if no constructor is defined
	//when we create one parameterized constructor, it is mandatory to add a default constructor
	
	
	public Page() {
		System.out.println("page default constructor");
	}
	
	public Page(int i) {  // in order to call this constructor we use "SUPER" keyword in child class
		System.out.println("page--constr--" +i);
	}
	
	
	public abstract void title(); // it is mandatory to write abstract keyword here to mention method without body
	
	public abstract void url();
	
	public void timeout() {
		System.out.println("timeout---20 seconds");
	}
	
	public final void displayLogo() { // final-- cannot override
		System.out.println("display logo---");
	}

}
