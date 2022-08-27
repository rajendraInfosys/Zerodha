package Method;

public class Nonstatic_call_from_differentclass {
	public static void main(String[] args) {
		Nonstatic_call_from_sameclass n1=new Nonstatic_call_from_sameclass();
		
		n1.m1();
		n1.m2();
		n1.m3();
	}
}
