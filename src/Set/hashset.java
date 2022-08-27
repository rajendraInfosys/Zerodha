package Set;

import java.util.HashSet;

public class hashset {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add("Indian");
	hs.add(1947);
	hs.add(null);
	hs.add(1947);
	hs.add(null);
	hs.add('Z');
	
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains(1947));
}
}

//duplicate, no. of null values, default capacity, order of insertion, best choice
//Duplicates are not allowed when order of insertion is random