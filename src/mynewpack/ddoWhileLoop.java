package mynewpack;

public class ddoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Dowhile-->statement-->check condition--> if true again go to statement 
		//print 1-10		
		int i=1;
		do {
	//		i++; //output= 2-11
			System.out.println(i); //execute the statement first at least once and then check condition
			i++; //output = 1-10
		} 
		while (i<=10);

		//use cases:
		//Pagination: we use to check only one page 
		
		System.out.println("-------");		
		
		//print 10-1
		int count = 10;
		do {
			System.out.println(count);
			count--;
		} while (count>=1);

		System.out.println("--------");
	//while loop-- 10-1
		int rowcount=10;
		while(rowcount>=1) {
			System.out.println(rowcount);
			rowcount--;
		}
	
	
	}

}
