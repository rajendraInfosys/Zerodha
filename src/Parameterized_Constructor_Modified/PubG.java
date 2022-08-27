package Parameterized_Constructor_Modified;

public class PubG {//ULC
public static void main(String[] args) {
	Gun g=new Gun("Sniper",10);
	g.shoot();
	System.out.println("1st Shoot is done");
	System.out.println();
	
	Gun g1=new Gun("AK47",5);
	g.shoot();
	System.out.println("2nd shoot is done");
	System.out.println();
	
	Gun g3=new Gun("Pistol",4);
	g3.shoot();
	System.out.println("3rd shoot is done");
	System.out.println();
	
	Gun g4=new Gun("Artillary",8);
	g4.shoot();
	System.out.println("4th shoot is done");
	System.out.println();
	
	Gun g5=new Gun("Tank",5);
	g5.shoot();
	System.out.println("5th shoot is done");
	System.out.println();
	
	Gun g6=new Gun("Bramhos",10);
	g6.shoot();
	System.out.println("6th shoot is done");
	System.out.println();
	
	Gun g7=new Gun("Navy",5);
	g7.shoot();
	System.out.println("7th shoot is done");
	System.out.println();
	
	Gun g8=new Gun("Snipershot",10);
	g8.shoot();
	System.out.println("8th shoot is done");
	System.out.println();
	
	Gun g9=new Gun("Gavthi Pistol",8);
	g9.shoot();
	System.out.println("9th shoot is done");
	System.out.println();
	
	Gun g10=new Gun("AK47",10);
	g10.shoot();
	System.out.println("10th shoot is done");
	System.out.println();
	
}
}
