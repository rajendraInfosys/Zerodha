package Method_Overriding;

public class Method_Override {
public static void main(String[] args) {
	Animal a=new Animal();
	a.Animal_voice();
	
	Dog d=new Dog();
	d.Animal_voice();
	
	Cat c=new Cat();
	c.Animal_voice();
}
}
