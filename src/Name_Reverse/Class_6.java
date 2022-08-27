package Name_Reverse;

public class Class_6 {
public static void main(String[] args) {
	String org="Rajedra";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--) {
		rev=rev + org.charAt(i);
	}
	System.out.println(rev);
}
}
