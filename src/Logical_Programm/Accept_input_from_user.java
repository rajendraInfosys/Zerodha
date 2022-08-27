package Logical_Programm;

import java.util.Scanner;

public class Accept_input_from_user {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1st number");
	int n1=s.nextInt();
	
	System.out.println("Enter 2nd number");
	int n2=s.nextInt();
	
	System.out.println(n1+n2);
}
}
