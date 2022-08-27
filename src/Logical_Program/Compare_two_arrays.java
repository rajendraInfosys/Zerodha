package Logical_Program;

import java.util.Arrays;

public class Compare_two_arrays {
public static void main(String[] args) {
	/*int ar1[]= {10,20,30,40,50};
	int ar2[]= {30,40,50,10,20};
	int ar3[]= {10,20,30,40,50};
	
	System.out.println(Arrays.equals(ar1,ar2));
	System.out.println(Arrays.equals(ar2,ar3));
	System.out.println(Arrays.equals(ar1,ar3));
	*/
	int ar1[]= {10,20,30,40,50,60,70};
	int ar2[]= {20,30,40,50,60,70,10};
	int ar3[]= {10,20,30,40,50,60,70};
	
	System.out.println(Arrays.equals(ar1, ar2));
	System.out.println(Arrays.equals(ar2, ar3));
	System.out.println(Arrays.equals(ar1, ar3));
	
}
}
