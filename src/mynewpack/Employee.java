package mynewpack;

public class Employee {

	//Functions in Java
	//data members: class variable and class methods
	
	//cannot create a method inside a method
	//methods are independent/parallel to each other
	
	//1.no input and no return
	//void --  does not return anything
	public void test() {
		System.out.println("test method");
	}
	
	//2. no input and some return
	//return type= String
	public String getName() {
		System.out.println("get name method");
		String n = "Tom";
		return n; //void and return cannot be written together
		
	}
	
	public int add() {
		System.out.println("add method");
		int a  =100;
		int b = 200;
		int c = 300;
		
		return c; //we can return only one value in a method
		
	}
	
	//3. some input and some return
	public int sum(int x, int y) {   //passing input parameters
		System.out.println("sum method");
		int total = x+y;
		return total;
	}
	
	//WAF: getMarks --> input param: studentName (String)
	//return student marks
	//if student name no found -- return something
	public int getMarks(String studentName) {
		System.out.println("getting student markas for:" +studentName);
		
		int marks = -1;
		
		if(studentName.equals("Tom")) {
			//return 90;
			marks = 90;
		}
		else if(studentName.equals("Ravi")) {
			//return 95;
			marks = 95;
		}
		else if(studentName.equals("Ahmed")) {
			//return 100;
			marks = 100;
		}
		else {
			System.out.println("student name is not found" +studentName);
			//return -1;
		}
		return marks;
		
	}
	
		
	
	public static void main(String[] args) {
		
		Employee e = new Employee(); 
		e.test(); //call a method from another method
		
		String name = e.getName();
		System.out.println(name); //always call a function with object ref--name
		System.out.println(name + 100);
		 
		
		int s = e.add();
		System.out.println(s);
		
		
		int sum = e.sum(10, 20);
		System.out.println(sum);
		
		int m = e.getMarks("Naveen");
		System.out.println(m); //marks = -1 as Naveen name is not found
		
//		int totalMarks = m + 5;
//		System.out.println(totalMarks);
	}

}
