package Inheritance;

public class Single_Level_Inheritance {
	public static void main(String[] args) {
		Son s=new Son();
		s.home();
		s.money();
		s.car();
		s.secBike();
		System.out.println("Beautiful Life");
		
		//Call object class method
		s.hashCode();
		s.toString();
		s.notify();
}
}
