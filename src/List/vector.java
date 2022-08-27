package List;

import java.util.Vector;

public class vector {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("Rajendra");
	v.add(1996);
	v.add('R');
	v.add(null);
	v.add(1996);
	v.add(null);
	
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.contains(1996));
	System.out.println(v.isEmpty());
}
}
//duplicate, no. of null values, default capacity, order of insertion, best choice