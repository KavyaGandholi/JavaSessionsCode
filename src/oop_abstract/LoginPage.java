package oop_abstract;

public class LoginPage extends Page{
	
	//it is mandatory to call abstract classes from parent class

	public LoginPage() {
		System.out.println("LoginPage default constructor");
	}
	
	public LoginPage(int i) {
		super(i); // here super keyword is used to call parent class constructor
		System.out.println("Loginpage--constr--" +i);
	}
	
	
	@Override
	public void title() {
		System.out.println("loginpage-- title");
		
	}

	@Override
	public void url() {
		System.out.println("LoginPage -- Url");
		
	}
	
	public void resetpwd() {
		
	}

	public void doLogin(String un, String pwd) {
		System.out.println("lp -: "+un+ " : " +pwd);
	}
}
