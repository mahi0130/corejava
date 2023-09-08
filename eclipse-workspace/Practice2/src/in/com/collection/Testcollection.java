package in.com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Testcollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("buraa mat dekho ");
		c.add("buraa mat suno");
		c.add("buraa mat kaho");
		c.add("raam");
	
		System.out.println("length of collection "+c.size());
		for (Object ele : c) {
			System.out.println(ele);			
		}
		Object[]oArray = c.toArray();
		
		for (Object ele : oArray) {
			String s = (String)ele;
			System.out.println(s);
			
			System.out.println(c.addAll(c));
//			c.clear();
//			System.out.println(c);
			System.out.println(c.contains("mahi"));
			System.out.println(c.containsAll(c));
			System.out.println(c.isEmpty());
			System.out.println(c.iterator());
//			System.out.println(c.remove("buraa mat kaho"));
//			System.out.println(c.removeAll(c));
			System.out.println(c.retainAll(c));
			System.out.println(c.size());
		}
	
	
	}
}
