package mynewpack;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//limitations;
		//1.only one data type -- to overcome this-- we use Object Array
		//2.size is fixed --to overcome the size--- we use dynamic array
		//----> this is Static Array------
		

		//Array index from 0-3-->lowest index=0 and highest indx=3 {10 20 30 40}-- index= 0-3
		//length=4; 
		//li=0; 
		//hi=length-1; -->4-1=3
		//length=hi+1;
		
		//1.int array
		//using new keyword -- it is used to allocate a memory
		int i[] = new int[4];
		i[0]=10; 
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]); //10
		System.out.println(i[3]);//40
	//	System.out.println(i[4]); //ArrayIndexoutofboundException
	//	System.out.println(i[-1]); //ArrayIndexoutofboundException
		System.out.println("------values-------");
		
		System.out.println(i.length); //4
		int len = i.length;
		int li = 0;
		int hi= len-1;
		System.out.println("li = " +li);
		System.out.println("hi =" +hi);
		System.out.println("length = " +len);
						
		
		System.out.println("---normal order----");
				
		//to print all the values from array-- iterate the array
		 for(int j=0; j<i.length; j++) {
			 System.out.println(i[j]);
			 
		 }
		 System.out.println("----reverse order----");
		 //to print array in reverse order
		 for ( int p = i.length-1; p>0; p-- ) {
			 System.out.println(i[p]);
		 }
		 
		 
		System.out.println("------arithematic op-----");
		System.out.println(i[0] + i[1]); //10+20
		
		
		System.out.println("----------");
		
		int k[] = new int[4];
		k[2] = 20;
		System.out.println(k[0]); // if we don' give any value, it will take by default value of integer=0
		System.out.println(k[1]); //0
		System.out.println(k[2]); //20
	
		System.out.println("----double----");
		
		//double
		double d[] = new double[2];
		System.out.println(d[0]); // default value of double=0.0
		d[0]=12.3;
		d[1]=13.5;
		System.out.println(d[0]); //12.3
		
		System.out.println("----char------");
		//char
		char c[] = new char[4];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 97;
		c[3] = '$';
		System.out.println(c[0]+c[2]); //194  --takes ASCII values
		
		for(int g = 0; g<c.length; g++) {
			System.out.println(c[g]);
		}
	
		byte b1 = 065; // octal number -- base 8
		System.out.println(b1);
			
	
	}

}
