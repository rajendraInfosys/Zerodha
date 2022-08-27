package Method1;

public class Non_static_call_from_same_class {
	public static void main(String[] args) {
		Non_static_call_from_same_class n1=new Non_static_call_from_same_class(); 
			n1.t1();
			n1.t2();
			n1.t3();
		
	}
	
	public void t1() {
		System.out.println("Sonali Ghadyale");
	}
	public void t2() {
		System.out.println("MBA HR & Finance");
	}
	public void t3() {
		System.out.println("Bsc in Electronics");
	}
}
