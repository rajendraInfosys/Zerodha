package This_Super_Keyword;

public class Sub extends Super{
	int j=20;
	
	public void m1() {
		int k=30;
		
		System.out.println(k);
		System.out.println(this.j);
		System.out.println(super.i);
	}
}
