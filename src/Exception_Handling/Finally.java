package Exception_Handling;

public class Finally {
public static void main(String[] args) {
	int a=1;
	int b=0;
	//int c=a/b;
	//System.out.println(c);
	
	try {
		int c=a/b;
	}
	catch(NullPointerException ref) {
		System.out.println("Enter valid denominator");
	}
	finally {
		System.out.println("Thanks for using ATM");
	}
}
}
