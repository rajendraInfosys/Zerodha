package Logical_Program;

public class Odd_Numbers_1to100 {
public static void main(String[] args) {
int num=100;
	
	for(int i=1;i<=num;i++) {
		if(i%2 != 0) {     //"!="  Not equal to
			System.out.print(i+" ");
		}
	}
}
}

