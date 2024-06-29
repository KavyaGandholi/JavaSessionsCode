package oop_Encapsulation;

public class Browser {
	
	//Encapsulation:
	//giving access to internal methods by creating public layer to private methods is called method encapsulation
	//private variables are accessible by public layer using getters and setters
	//private methods are accessible by public method 
	
	public void launchBrowser() {
		System.out.println("launching browser..");
		checkbrowserVersion(); //these methods are called internal methods
		checkOSCompatibility();
		enoughRAMSpace();
		checkBrowserUpgrade();
		
		
	}
	private void checkbrowserVersion() {
		System.out.println("checkbrowserVersion..");
	}
	private void checkOSCompatibility() {
		System.out.println("checkOSCompatibility browser..");
	}
	private void enoughRAMSpace() {
		System.out.println("enoughRAMSpace");
	}
	private void checkBrowserUpgrade() {
		System.out.println("checkBrowserUpgrade");
	}
	
	
	

}
