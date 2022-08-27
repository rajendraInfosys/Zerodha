package Logical_Program;

public class Leap_year {
public static void main(String[] args) {
	int year=2009;
	
	/*if(year%4==0 && year%100!=0 && year%400 !=0) {
		System.out.println("Leap year");
	}
	else {
		System.out.println("Not leap year");
	}
	*/
	
	if(year%4==0 && year%100!=0 && year%400!=0) {
		System.out.println("Year is leap year");
	}
	else {
		System.out.println("Year is ordinary");
	}
	}
}
