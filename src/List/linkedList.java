package List;

import java.util.LinkedList;

public class linkedList {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("Rajendra");
	l.add(1996);
	l.add('Q');
	l.add(null);
	l.add(1996);
	l.add(null);
	
	System.out.println(l);
	
	
}
}
//Duplicates, No. of null values, order of insertion, default capacity, best choice, worst choice