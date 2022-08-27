package Logical_Program;

public class Remove_white_spaces {
public static void main(String[] args) {
	String str="R A J E N D R A";
	
	str=str.replaceAll("\\s+", "");
	System.out.println(str);
}
}
