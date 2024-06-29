package mynewpack;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList is a default class
		//create ArrayList class with 'new' keyword
		ArrayList ar = new ArrayList(); // empty array list.. VC=10 by default
		System.out.println(ar.size()); //0
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size()); //2
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size()); //4
		ar.add(500);
		ar.add(600);
		System.out.println(ar.get(0));
//		System.out.println(ar.get(6)); //Exception-- IndexOutOfBound
//		System.out.println(ar.get(-1)); //Exception-- IndexOutOfBound
		
		//to print values of all in arraylist
		
		for(int i=0; i<ar.size(); i++) { 
			System.out.println(ar.get(i));
		}
	} 

}
