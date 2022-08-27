package Logical_Program;

public class Even_numbers_1to100 {
public static void main(String[] args) {
	/*int num=100;
	
	for(int i=1;i<=num;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
	*/
	int n=100;
	int count=0;
	for(int i=1;i<=n;i++) {
		if(i%2==0) {
			count++;
			System.out.print(i+" ");
		}
		
	}
	System.out.println();
	System.out.println(count);
}
}
