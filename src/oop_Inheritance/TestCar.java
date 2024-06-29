package oop_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		//BMW can access all its methods as well as parent class methods
		b.start(); //here BMW method will be called--latest method(it's own property) will be called
		
		
	}

}
