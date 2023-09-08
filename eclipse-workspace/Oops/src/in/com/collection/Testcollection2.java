
package in.com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Testcollection2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(100);
		list.add("mahi");
		list.add('m');
		list.add(true);
		list.add("mahi");
		System.out.println("list="+list);
		System.out.println(list.get(3));
		list.set(3, "kasera");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.indexOf("mahi"));
		
		System.out.println(list.lastIndexOf("mahi"));
		System.out.println(list.subList(0,2));
		ListIterator it=list.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}
}
