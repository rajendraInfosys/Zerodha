package Logical_Program;

import java.util.Scanner;

public class Accept_input_from_user {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1st number");
	int num1=scan.nextInt();
	
	System.out.println("Enter 2nd number");
	int num2=scan.nextInt();
	
	System.out.println("Addition: "+(num1+num2));
}
}
