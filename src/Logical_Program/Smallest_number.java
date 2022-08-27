package Logical_Program;

public class Smallest_number {
public static void main(String[] args) {
	int a=40;
	int b=80;
	int c=60;
	
	if(a<=b && a<=c) {
		System.out.println("Smallest number is a");
	}
	else if(b<=a && b<=c) {
		System.out.println("Smallest number is b");
	}
	else {
		System.out.println("Smallest number is c");
	}
}
}

