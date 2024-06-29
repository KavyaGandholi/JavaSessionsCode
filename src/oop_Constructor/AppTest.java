package oop_Constructor;

public class AppTest {

	public static void main(String[] args) {
		
		ApplicationSystem app1 = new ApplicationSystem("amazon", 5, "www.amazon.com");
		//System.out.println(app1.name + " " +app1.pages + " " +app1.url);
		
		int c= app1.getPageCount(app1.name);
		System.out.println(c); //whatever pages we defined 
		
		ApplicationSystem app2 = new ApplicationSystem("Flipkart", 25, "www.amazon.com");

		int c2 = app2.getPageCount(app2.name);
		System.out.println(c2);
	
	
	}

}
