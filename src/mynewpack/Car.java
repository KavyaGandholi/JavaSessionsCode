package mynewpack;

public class Car {

	//we create instance class variables:
	String name;
	int price;
	String color;
	boolean isAutomatic;
	
	// these are xerox copies of the class
	
	public static void main(String[] args) {
		
		//create object of this class: 
		//className objname =  new class
		
		Car c1 =  new Car();
		
		c1.name = "BMW";
		c1.price = 50;
		c1.color = "Red";
		c1.isAutomatic = true;
		
		System.out.println(c1.name);
		System.out.println(c1.name + " " +c1.price + " " +c1.color+ " " +c1.isAutomatic);
				

		//null reference object:
		Car c2 = new Car();
		System.out.println(c2.name); //null -- it takes default value as c2 is not initialized
		
		
		
		
	}

}
