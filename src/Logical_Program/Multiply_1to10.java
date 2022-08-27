package Logical_Program;

public class Multiply_1to10 {
public static void main(String[] args) {
	int num=10;
	long fact=1l;
	
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
}
}
