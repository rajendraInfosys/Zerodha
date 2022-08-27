package Super_Key;

public class Sample2 extends Sample1{   //Sub class
	int a=60;                           //Global variable of sub class
	
	public void test() {
		int a=20;                       //Local variable of sub class
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
