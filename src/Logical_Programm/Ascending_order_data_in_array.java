package Logical_Programm;

import java.util.Arrays;

public class Ascending_order_data_in_array {
public static void main(String[] args) {
	int ar[]= {30,60,30,10,70,40,90,20};
	Arrays.sort(ar);
	for(int i=0;i<=ar.length-1;i++) {
		System.out.print(ar[i]+" ");
	}
	
}
}
