package Conditional_statements;

public class Else_if_ladder {
public static void main(String[] args) {
	int marks=20;
	
	if(marks>=80) {
		System.out.println("1st class");
	}
	else if(marks>=60) {
		System.out.println("2nd class");
	}
	else if(marks>=40) {
		System.out.println("3rd class");
	}
	else {
		System.out.println("Failed");
	}
}
}
