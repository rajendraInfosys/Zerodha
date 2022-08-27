package Set;

import java.util.TreeSet;

public class Tree_Set {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add('S');
	t.add('A');
	t.add('R');
	t.add('B');
	t.add('Z');
	t.add('S');
	//t.add(null);
	
	//No default capacity
	System.out.println(t);
}
}
