package in.com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection1 {
public static void main(String[] args) {
	Collection c1 = new ArrayList();
	c1.add(100);
	c1.add("mahi");
	c1.add('m');
	c1.add(true);
	c1.add("ten");
	c1.add(1);
	
	System.out.println("c1="+c1);
	Collection c2 = new ArrayList();
	c2.add(1);
	c2.add("ten");
	
	
	System.out.println("c2="+c2);
	c1.addAll(c2);
	System.out.println("c1="+c1);
	c2.clear();
	System.out.println("c2="+c2);
	c1.contains(c2);
	System.out.println("contains ="+c1.contains("ten"));
	c1.remove("mahi");
	System.out.println("c1="+c1);
	c1.containsAll(c2);
	System.out.println("c1="+c1.containsAll(c2));
	c1.isEmpty();
	System.out.println("c1="+c1.isEmpty());
	
	
	c1.size();
	System.out.println("size="+c1.size());
	
}
}
