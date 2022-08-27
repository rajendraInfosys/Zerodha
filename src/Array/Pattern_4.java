package Array;

public class Pattern_4 {
public static void main(String[] args) {
	//     ^  ^  *  ^  ^
	//     ^  *  *  *  ^
	//     *  *  *  *  *
	//    
	
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=5;j++) {
			if(i==1&&j==1) {
				System.out.print(" ");
			}
			else if(i==1&&j==2) {
				System.out.print(" ");
			}
			else if(i==2&&j==1) {
				System.out.print(" ");
			}
			else if(i==1&&j==4) {
				System.out.print(" ");
			}
			else if(i==1&&j==5) {
				System.out.print(" ");
			}
			else if(i==2&&j==5) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
	
