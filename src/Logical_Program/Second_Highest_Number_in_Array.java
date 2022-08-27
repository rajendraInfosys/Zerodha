package Logical_Program;

import java.util.Arrays;

public class Second_Highest_Number_in_Array {
public static void main(String[] args) {
	int num[] = {111,9,56,8,-1,3,55};
	Arrays.sort(num);
	int n=num[num.length-2];
	System.out.println("Second highest number: "+n);
	
}
}
