package Name_Reverse;

public class Class_1 {
public static void main(String[] args) {
	String org="KATAK";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--) {
		rev= rev+org.charAt(i);
	}
	System.out.println(rev);
	
	if(rev.equals(org)) {
		System.out.println("Given string is pallindrome");
	}
	else {
		System.out.println("Not Pallindrome");
	}
}
}
