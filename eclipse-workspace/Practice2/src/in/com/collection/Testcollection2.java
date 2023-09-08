package in.com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Testcollection2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add('a');
		c1.add("byyy");
		c1.add("Abhi");
		Collection c2 = new ArrayList();
		c2.add(2);
		c2.add('b');
		c2.add("hyy");
		c2.add("shek");
		
		
		System.out.println("c1= "+c1);
		System.out.println("c2="+c2);
		c1.addAll(c2);
		System.out.println(c1);
	//	c1.clear();
		//System.out.println(c1);
		System.out.println(c1.contains("Abhi"));
		System.out.println(c1.containsAll(c2));
		System.out.println(c1.isEmpty());
		System.out.println(c1.iterator());
		System.out.println(c1.remove("Abhi"));
		System.out.println(c1);
		System.out.println(c1.removeAll(c2));
		System.out.println(c1);
		//System.out.println(c1.retainAll(c2));
		//System.out.println(c1);
		System.out.println(c1.size());
		
		
		
		
		Iterator i =  c1.iterator();
		while (i.hasNext()) {
			Object o = i.next();
		} 
		}
	}

