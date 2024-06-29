package mynewpack;

import java.util.ArrayList;

public class ArrayListwithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arraylist with generics:
		
	//	ArrayList ar = new ArrayList();
		
		ArrayList<Integer>  marksList = new ArrayList<Integer>();
		
		marksList.add(100);
		marksList.add(200);
		
		ArrayList<Double>  bmiList = new ArrayList<Double>();
		bmiList.add(24.5);
		
		ArrayList<String>  empList = new ArrayList<String>();
		
		empList.add("Kavya");
		empList.add("Vinay");
		empList.add("John");
		System.out.println(empList.size());
		
		for(int i=0; i<empList.size(); i++) {
			System.out.println((i));
		}
		
		for(String e : empList) {
			System.out.println(e);
		}
		
		
		//design a list of emp data
		//name(String), age(int), salary(double), gender(char)
		
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Tom");
		empData.add(25);
		empData.add(250.50);
		empData.add('M');
		
	//	System.out.println(empData.size());
		
		for(Object e : empData) {
		System.out.println(e);
		
	}

		System.out.println("-------");
		
//		for (int i=0 ; i<empData.size(); i--) {
//			System.out.println(empData.length(i));
//			
//		}
	}	
		
	}


