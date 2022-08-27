package Exception_Handling;

public class Arithmatic_Exception {
public static void main(String[] args) {
	int a=1;
	int b=0;
	//int c=a/b;--------{Risky code}
	//System.out.println(c);
	
	try {
		int c=a/b;  //Risky code
	}
	catch(ArithmeticException ref) {
	
	System.out.println("Enter valid Denominator");
}
}
}
