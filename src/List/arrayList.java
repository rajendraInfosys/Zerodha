package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrayList {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("Sonali");
	a.add(1999);
	a.add('S');
	a.add(null);
	a.add(1999);
	a.add(null);
	
//	System.out.println(a);
//	System.out.println(a.size());
//	System.out.println(a.contains(1999));
//	System.out.println(a.isEmpty());\
	
//	Iterator itr=a.iterator();
//	while(itr.hasNext()) {
//		System.out.println
//		(itr.next());
		
	ListIterator litr=a.listIterator();
	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
	}
}