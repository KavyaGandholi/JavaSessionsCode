package mynewpack;

public class User {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "Arthi";
		u1.age = 10;
		u1.city = "Pune";
		
		User u2 = new User();
		u2.name = "Nitin";
		u2.age = 20;
		u2.city = "Bangalore";
		
		User u3 = new User();
		u3.name = "Ravi";
		u3.age = 30;
		u3.city = "LA";
		
//		System.out.println(u1.name+ " " +u1.age+ " " +u1.city);
//		System.out.println(u2.name+ " " +u2.age+ " " +u2.city);
//		System.out.println(u3.name+ " " +u3.age+ " " +u3.city);
		
		//to assign one ref to another
		u1 = u2; //u1 is assigned with u2 values
		System.out.println(u1.name+ " " +u1.age+ " " +u1.city);
		System.out.println(u2.name+ " " +u2.age+ " " +u2.city);
		System.out.println(u3.name+ " " +u3.age+ " " +u3.city);
	

		u2 = u3; //u2 is assigned with u3 values and u1 will be with u2 values
		//u1 = nitin, u2=ravi , u3 =ravi 
		System.out.println(u1.name+ " " +u1.age+ " " +u1.city);
		System.out.println(u2.name+ " " +u2.age+ " " +u2.city);
		System.out.println(u3.name+ " " +u3.age+ " " +u3.city);
		
		u3 = u1;
		System.out.println(u1.name+ " " +u1.age+ " " +u1.city);
		System.out.println(u2.name+ " " +u2.age+ " " +u2.city);
		System.out.println(u3.name+ " " +u3.age+ " " +u3.city);
		
		
	}

}
