package Logical_Program;

public class Reverse_string {
public static void main(String[] args) {
	String org="Velocity";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
}
}
   