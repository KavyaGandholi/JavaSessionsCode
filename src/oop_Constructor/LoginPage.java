package oop_Constructor;

public class LoginPage {

	String username;
	String password;
	
	//hidden/default constructor.. when no constructor is defined
	
	//this is my preferred constructor
	//this just define username and password.. but e need to create seperate method to perform login
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	//let's write  business logic in method -- here doLogin method is behaving like a API-- also called WebService
	public void doLogin(String un, String pwd) {
		System.out.println("enter username:" + un);
		System.out.println("enter password:" + pwd);
		System.out.println("Click on login");
		System.out.println("user logged in successfully");
	}

	

	public static void main(String[] args) {
		
		LoginPage user1 = new LoginPage("Kavya", "Kavya123");
	//	System.out.println(user1.username + " " + user1.password);
		user1.doLogin(user1.username, user1.password);
		
		LoginPage user2 = new LoginPage("seller", "Seller123");
		user2.doLogin(user2.username, user2.password);

		//HERE WE CREATED COMMON LOGIN METHOD TO ACCESS FOR DIFFERENT USERS --user1, user2...etc
	}

}
