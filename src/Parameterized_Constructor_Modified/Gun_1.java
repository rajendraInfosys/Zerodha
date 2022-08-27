package Parameterized_Constructor_Modified;

public class Gun_1 {
	String gunName;
	int noOfBullets;
	
	public Gun_1(String gunName, int noOfBullets) {
		this.gunName=gunName;
		this.noOfBullets=noOfBullets;
	}
	public void shoot() {
		for(int i=1;i<=noOfBullets;i++) {
			System.out.println("India");
		}
	}
}
