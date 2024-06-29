package oop_Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		
//		Employee e1 = new Employee();
//		
//		//e1.name = 'Kavya"; // this is not accessible because it is private variable
//		e1.setName("Tom");		
//		e1.setAge(20);
//		e1.setPermanent(false);
//		
//		System.out.println(e1.getName());
//		System.out.println(e1.getAge());
//		System.out.println(e1.isPermanent());
		
		
		Employee e1 = new Employee("Tom", 15, false);
		
		//get: retreive data
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.isPermanent());
		
		e1.setAge(35); //put: Update data
		
		// again get: with updated data
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.isPermanent());
		
		e1.setPermanent(true); //update data
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.isPermanent());
		
	
	}

}
