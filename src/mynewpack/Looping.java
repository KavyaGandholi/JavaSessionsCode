package mynewpack;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//While loop:First Condition check (true)--> execute statement
		
		int i = 1;
		while (i<=10) {
			System.out.println(i);
		//	i++;   //pre increment or post increment-- same output
			++i;
		//	i=i+1; //same output
	}

		//print even numbers from 1-10
		int e = 0;
		while(e<=10) {
			System.out.println(e); // 0-10
			e=e+2;
		}
		//print odd numbers
		int f = 1;
		while(f<=10) {
			System.out.println(f); //1-9
			f= f+2;
		}
		
		//infinite loop
		while(true) {
			System.out.println("this is kavya..");
			break; // if not given break, it will print infinite loop
		}
		
		//from 1-100
		//multiplication of 5 -- then print hi
		int k =1;
		while(k<=100) {
			System.out.println(k);
			if(k % 5 == 0) {
				System.out.println("hi...");	
			}			
			k++;
		}
		System.out.println("-----------");
		
		//For Loop:intiialize-->check condition-->increment/decrement
		
		//print 1-10
		for (int t = 1; t<=10; t++) {
			System.out.println(t);
		if(t==5) {
			break;
		}
		}
		
		
		
}
}
