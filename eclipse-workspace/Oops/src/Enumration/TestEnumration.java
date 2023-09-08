package Enumration;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumration {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("bolo");
		v.add("jay");
		v.add("shree");
		v.add(10);
		Enumeration e = v.elements();
		v.add(100);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
