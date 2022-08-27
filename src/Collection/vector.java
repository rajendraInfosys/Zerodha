package Collection;

import java.util.Vector;

public class vector {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("Rajendra");
	v.add(1996);
	v.add('A');
	v.add("Yamgar");
	v.add(1996);
	v.add(null);
	v.add(null);
	
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.contains(1996));
	System.out.println(v.indexOf("Yamgar"));
	System.out.println(v.isEmpty());
	System.out.println(v.remove(5));
	v.add("Shravi");
	v.add(1, "Sonali");
	System.out.println(v);
}
}
