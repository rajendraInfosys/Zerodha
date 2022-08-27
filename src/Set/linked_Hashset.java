package Set;

import java.util.LinkedHashSet;

public class linked_Hashset {
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("Shravi");
	lhs.add(2020);
	lhs.add('S');
	lhs.add(null);
	lhs.add(null);
	lhs.add(2020);
	lhs.add("Ghadyale");
	
	System.out.println(lhs);
	System.out.println(lhs.size());
	System.out.println(lhs.contains(2020));
	System.out.println(lhs.isEmpty());
}
}
// duplicate, no. of null values, default capacity, order of insertion, best choice