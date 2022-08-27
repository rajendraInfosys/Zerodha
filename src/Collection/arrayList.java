package Collection;

import java.util.ArrayList;

public class arrayList {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("Rajendra");
	al.add(1996);
	al.add(null);
	al.add("Shravi");
	al.add(null);
	al.add(1996);
	
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.contains(1996));
	System.out.println(al.indexOf("Shravi"));
	
	al.add(2, "Yamgar");
	System.out.println(al);
	
	System.out.println(al.remove(null));
	System.out.println(al);
	
	System.out.println(al.get(3));
}
}
