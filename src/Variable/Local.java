package Variable;

public class Local {
		static double d=20.2;
	public static void main(String[] args) {
		//rule>>1...Printing variable means we are printing value of the variable
		int i=10;
		System.out.println(d);
		
		//rule>>2...Without declaration or initialization we cannot use local variables
		byte b;
		System.out.println(b);
		
		//rule>>3...Two local variables doesn't have same names 
		double d=10;
		double d=20;
		System.out.println(d);
		
		//rule>>4...We can re-initialize the local variable any no. of times
		long z=10l;
		z=20l;
		z=30l;
		z=40l;
		System.out.println(z);
		
		//rule>>5...Once the re-initialization is done then the new/latest value of variable is displayed
		          //and other values get vanished or deleted
		System.out.println(z);
				
		
		
		
	}
	

}
