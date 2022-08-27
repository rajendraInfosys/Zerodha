package Logical_Program;

import java.util.Arrays;

public class Ascending_order_data_in_array {
public static void main(String[] args) {
	int ar[]= {50,30,40,10,60,20};
	//Ascending order
	Arrays.sort(ar);
	for(int i=0;i<=ar.length-1;i++) {
		System.out.print(ar[i]+" ");
	}
	System.out.println();
	//Descending order
	Arrays.sort(ar);
	for(int i=ar.length-1;i>=0;i--) {
		System.out.print(ar[i]+" ");
	}
}
}
