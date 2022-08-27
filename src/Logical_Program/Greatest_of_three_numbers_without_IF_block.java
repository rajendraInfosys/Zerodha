package Logical_Program;

public class Greatest_of_three_numbers_without_IF_block {
public static void main(String[] args) {
	/*int a=20;
	int b=60;
	int c=40;
	
	int largeNum= c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	System.out.println(largeNum);
	*/
	int a=10;
	int b=50;
	int c=20;
	
	int largeNum=c>(a>b ? a:b) ?c: (a>b ? a:b);
	System.out.println(largeNum);
}
}
