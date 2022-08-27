package Method;

public class Nonstatic_call_from_sameclass {
	public static void main(String[] args) {
		Nonstatic_call_from_sameclass n=new Nonstatic_call_from_sameclass();
		n.m1();
		n.m2();
		n.m3();
		
		
		
	}
	
	public void m1() {
		System.out.println("I am non-static from same class m1");
	}
	
	public void m2() {
		System.out.println("I am non-static from same class m2");
	}
	
	public void m3() {
		System.out.println("I am non-static from same class m3");
	}
	
}
