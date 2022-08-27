package Constructer;

public class Paracons_gun {
	String gunName;
	int noOfBullets;
	
	public Paracons_gun(String gun,int bullets) {
		this.gunName=gun;
		this.noOfBullets=bullets;
	}
	public void shoot() {
		for(int i=1;i<=noOfBullets;i++) {
			System.out.println("Gunnnnn");
		}
	}
	
}
