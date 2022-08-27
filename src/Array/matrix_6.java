package Array;

public class matrix_6 {
public static void main(String[] args) {
	int i[][]= new int[2][2];
	i[0][0]=20;
	i[0][1]=40;
	i[1][0]=60;
	i[1][1]=80;
	
	//System.out.println(i[1][1]);
			
	for(int j=0;j<=1;j++) {
		for(int k=0;k<=1;k++) {
			System.out.print(i[j][k]+" ");
		}
		System.out.println();
	}
			
}
}
