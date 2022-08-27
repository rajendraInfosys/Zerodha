package Class_members;

public class Static_Initializer_block {
public static void main(String[] args) {
	System.out.println("100");
	System.out.println("200");
	System.out.println("300");
}

	static {
		System.out.println("500");
	}
	static {
		System.out.println("600");
	}



}
