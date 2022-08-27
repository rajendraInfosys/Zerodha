package Logical_Program;

import java.util.Scanner;

public class Replace_multiple_spacial_characters {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=scan.next();
	String actName=name.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(actName);
}
}
