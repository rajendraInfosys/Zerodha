package Name_Reverse;

public class Class_3 {
public static void main(String[] args) {
	String org="Sonali";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--) {
		rev= rev + org.charAt(i);
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
