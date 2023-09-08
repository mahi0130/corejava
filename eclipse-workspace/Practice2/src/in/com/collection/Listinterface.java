package in.com.collection;

import java.util.ArrayList;

public class Listinterface {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("its very big problem");
		a.add("lest go for solve it ");
		a.add("tell me your plan");
		System.out.println(a.add("hUM HONGE KAMYAB"));
		System.out.println(a.get(2));
		//System.out.println(a.remove(2));
		System.out.println(a.set(2, "chalo kuch naya karte h"));
		System.out.println(a.subList(0, 3));
		System.out.println(a.indexOf(2));
		System.out.println(a.lastIndexOf(2));
	}
}
