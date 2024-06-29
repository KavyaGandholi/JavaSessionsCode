package oop_Constructor;

public class EmployeeType {
	
	String name;
	int age;
	double salary;
	
	//constructor of the class:
	//1. name should be same as class name but func name can be any name
	//2. cannot return anything but function may or may not return
	//3. For constructor-- there is no void keyword
	//4. Constructor will be called when we create object but function will be called with object ref name
	//5. Constructor cannot be Static
	
	// Constructor Overloading:
	public EmployeeType() { //0 parameter
		System.out.println("default Constructor..");
	}

	public EmployeeType(int a) { //1 parameter
		System.out.println("One Param..Const.." +a);
	}

	public EmployeeType(int a, String b) { //2 parameter
		System.out.println("2 param..Const.." +a + " " +b);
	}
	
	public void test() {
		System.out.println("Test method..");
	}


	public static void  main (String[] args) {
		EmployeeType e1 = new EmployeeType(10 , "tom"); // constructor will be called only when we create object
		e1.test();
		
		
			
		
	}
	
}