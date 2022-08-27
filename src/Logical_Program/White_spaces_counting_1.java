package Logical_Program;

public class White_spaces_counting_1 {
public static void main(String[] args) {
	String n="R A J E N D R A Y A M G A R";
	int count=0;
	for(int i=0;i<=n.length()-1;i++) {
		char ch=n.charAt(i);
		if(ch==' ') {
			count++;
		}
	}
	System.out.println(count);
}
}