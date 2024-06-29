package mynewpack;

public class Application {

	public double getNumber(double d1, double d2) {
		
		double d = d1 + d2;
		return d;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Application obj = new Application();
		double num = obj.getNumber(1.5, 2.5);
		System.out.println(num);
		

		
	}

}
