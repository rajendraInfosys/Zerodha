package Array;

public class Matrix_7 {
public static void main(String[] args) {
	int i[][]=new int[3][3];
	i[0][0]=10;
	i[0][1]=20;
	i[0][2]=30;
	i[1][0]=40;
	i[1][1]=50;
	i[1][2]=60;
	i[2][0]=70;
	i[2][1]=80;
	i[2][2]=90;
	
	//System.out.println(i[2][1]);
	for(int j=0;j<=2;j++) {
		for(int k=0;k<=2;k++) {
			System.out.print(i[j][k]+" ");
		}
		System.out.println();
	}
	//System.out.println();
}
}
