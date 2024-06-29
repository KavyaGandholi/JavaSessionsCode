package oop_Constructor;

public class ApplicationSystem {

	String name;
	int pages;
	String url;
	
	public ApplicationSystem(String name, int pages, String url) {
		this.name = name;
		this.pages = pages;
		this.url = url;
	}

	public int getPageCount(String appName) {
		
		switch (appName) {
		case "amazon":
			return this.pages; //we can also write just pages instead of this.pages
		case "Flipkart":
			return this.pages;
		case "Uber":
			return this.pages;
				

		default:
			System.out.println("app not found");
			return -1;
		}
	}
	
}
