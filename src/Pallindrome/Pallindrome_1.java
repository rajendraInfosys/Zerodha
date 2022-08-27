package Pallindrome;

public class Pallindrome_1 {
public static void main(String[] args) {
	String org="Rajendra";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--) {
		rev= rev+org.charAt(i);
	}
	System.out.println(rev);
	
	if(org.equals(rev)) {
		System.out.println("Pallindrome");
	}
	else {
		System.out.println("Not Pallindrome");
	}
		
}
}
