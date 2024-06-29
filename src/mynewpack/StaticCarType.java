package mynewpack;

public class StaticCarType {

	String name;
	int price;
	String plateNumber;
	static int wheels;
	
	
	public static void main(String[] args) {
		StaticCarType c1 =  new StaticCarType();
		c1.name = "BMW";
		c1.price = 70;
		c1.plateNumber="KA 123";
		c1.wheels = 4;
		
		StaticCarType c2 =  new StaticCarType();
		c2.name = "Audi";
		c2.price = 60;
		c2.plateNumber="KA 456";
		
		
		//how to access static variables:
		//1.by using the class name
		System.out.println(StaticCarType.wheels);
		
		
		//2. direct access
		System.out.println(wheels);
		
		//3.can i access static vars using obj ref? --  not recommended
	//	System.out.println(c1.wheels); -- this gives error
		
				
		
	}

}
