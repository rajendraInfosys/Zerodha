package Hierarchical_Inheritance;

public class Hierarchical_Inheritnce {
public static void main(String[] args) {
	Son1 s1=new Son1();
	s1.home();
	s1.money();
	s1.car();
	s1.secBike();
	System.out.println(s1);
	
	System.out.println();
	
	Son2 s2=new Son2();
	s2.home();
	s2.money();
	s2.car();
	s2.secMobile();
	System.out.println(s2);
	
	System.out.println();
	
	Son3 s3=new Son3();
	s3.home();
	s3.money();
	s3.car();
	s3.secLaptop();
}
}
