package mynewpack;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//long, double, float -- switch doesn't work
		//works for -- byte short integer char and strings
		
		String browser = "i.e";
		int timeOut = 20;
		
		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome");
			
			if(timeOut == 20) {
				System.out.println("Please close the browser");
			}
			
			break;
		case "Firefox":
			System.out.println("Launch Firefox");
			break;
		case "i.e":
			System.out.println("Launch i.e.");
			break;
		case "Safari":
			System.out.println("Launch ChrSafariome");
			break;

		default:
			System.out.println("execute right browser:"+ browser);
			break;
		}
	}

}
