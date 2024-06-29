package oop_abstract;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		lp.displayLogo();
		lp.title();
		lp.url();
		lp.doLogin("kavya", "Kavya@123");
	}

}
