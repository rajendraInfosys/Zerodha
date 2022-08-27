package Para;

public class Para_Cons_Gun {
	String gunName;
	int noOfBullets;
	
	public Para_Cons_Gun(String gunName, int noOfBullets) {
		this.gunName=gunName;
		this.noOfBullets=noOfBullets;
	}
	public void shoot() {
		for(int i=1;i<=noOfBullets;i++) {
			System.out.println("Indian Army");
		}
	}
}
