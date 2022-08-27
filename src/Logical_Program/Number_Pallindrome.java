package Logical_Program;

public class Number_Pallindrome {
public static void main(String[] args) {
int num=12621;
int revNum=0;
/*
for(int i=num;i>0;i=i/10) {
	int rem=i%10;
	revNum=revNum*10+rem;
}
System.out.println(revNum);
if(num==revNum) {
	System.out.println("Pallindrome");
}
else {
	System.out.println("Not pallindrome");
}
*/
for(int i=num;i>0;i=i/10) {
	int rem=i%10;
	revNum=revNum*10+rem;
}
System.out.println(revNum);
}
}