package Array;

public class Matrix_3 {
public static void main(String[] args) {
	String ar[][]=new String[2][2];
	ar[0][0]="Rajendra";
	ar[0][1]="Shravi";
	ar[1][0]="Sonali";
	ar[1][1]="Suraj";
	
	for(int i=0;i<=1;i++) {
		for(int j=0;j<=1;j++){
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
		
	}
}
}
