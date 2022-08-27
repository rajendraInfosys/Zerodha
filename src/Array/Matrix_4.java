package Array;

public class Matrix_4 {
public static void main(String[] args) {
	int i[][] =new int[3][3];
	i[1][1]=10;
	i[1][2]=20;
	i[1][3]=30;
	i[2][1]=40;
	i[2][2]=50;
	i[2][3]=60;
	i[3][1]=70;
	i[3][2]=80;
	i[3][3]=90;
	
	for(int j=1;j<=3;j++) {
		for(int k=1;k<=3;k++) {
			System.out.println(i[j][k]);
		}
	}
	}
}
