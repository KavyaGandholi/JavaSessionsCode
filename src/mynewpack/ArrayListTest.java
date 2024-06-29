package mynewpack;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(90);
		ar.add(14);
		ar.add(1);
		System.out.println(ar);
		
		// to sort in ascending order
		System.out.println("-----sort the numbers------");
		Collections.sort(ar);
		System.out.println(ar);
		
		//to sort in reverse order
		System.out.println("----reverse order-----");
		
		Collections.sort(ar, Collections.reverseOrder());
		System.out.println(ar);
		
		//to find min and max value
		System.out.println("min value :" + ar.get(0));
		System.out.println("max value : " +ar.get(ar.size()-1));
		
		
		
		ArrayList ar1 = new ArrayList();
		ar1.add(30);
		ar1.add(60);
		ar1.add(11);
		
		System.out.println(ar1);
		//to add both ar and ar1
		ar1.addAll(ar);
		System.out.println(ar1); // it will merge both arrays by using addAll 
		
		
		
		//to sort the list 
		ArrayList<String> names = new ArrayList<String>();
		names.add("tom");
		names.add("Peter");
		names.add("Kavya");
		
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
	
	
	
	}

}
