package Constructor_Overloading;

public class Overload {
	int id;
	String name;
	int age;
	
	
	public Overload(int id,String name){
		//this.id=id;
		//this.name=name;
		System.out.print(id+" ");
		System.out.print(name+" ");
		
		System.out.println();
	}
	
	public Overload(int id,String name,int age){
		//this.id=id;
		//this.name=name;
		//this.age=age;
		System.out.print(id+" ");
		System.out.print(name+" ");
		System.out.print(age+" ");
	}
}

