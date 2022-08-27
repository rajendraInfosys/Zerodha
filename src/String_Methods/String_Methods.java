package String_Methods;

public class String_Methods {
public static void main(String[] args) {
	String s1="rajendra";
	String s2="RAJENDRA";
	String s3="RAJE";
	
	//lenght()==It will give length of characters
	System.out.println(s1.length());
	System.out.println(s2.length());
	
	//toUpperCase()==It will convert lowercase string to UPPERCASE
	System.out.println(s1.toUpperCase());
	
	//toLowerCase()==It will convert UPPERCASE string to lowercase
	System.out.println(s2.toLowerCase());
	System.out.println(s3.toLowerCase());
	
	//equals()==It will compare two strings
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s3));
	
	//equalIgnoreCase()==It will compare two strings by ignoring their cases
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s2.equalsIgnoreCase(s3));
	
	//contains()==It will check for characters inside two strings
	System.out.println(s1.contains(s2));
	System.out.println(s2.contains(s3));
	
	//chatAt()==It will give character of string at perticular position
	System.out.println(s1.charAt(3));
	System.out.println(s2.charAt(5));
	
	//indexOf()==It will give index of perticular character
	System.out.println(s1.indexOf('d'));
	System.out.println(s2.indexOf('A'));
	
	//lastIndexOf()==It will give last index of string
	System.out.println(s1.lastIndexOf('j'));
	System.out.println(s2.lastIndexOf('A'));
	System.out.println(s1.lastIndexOf('r'));
	
	//startWith()==It will check our string is start with perticular character
	System.out.println(s1.startsWith("ra"));
	System.out.println(s2.startsWith("JE"));
	
	//endsWith()==It will check our string is ends with perticular character
	System.out.println(s1.endsWith("ra"));
	
	//subString()==It will break the string and display
	System.out.println(s2.substring(5));
	
	//concat()==It will join two strings
	System.out.println(s1.concat(s2));
	System.out.println(s2.concat(s3));
	
	//replace()==It will replace the collection of characters
	System.out.println(s2.replace("NDRA", "Shivaji"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
