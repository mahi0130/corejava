package in.com.collection;

import java.util.HashMap;
import java.util.Map;

public class Testmap {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1,"reyansh");
		map.put(2,"aradhya");
		map.put(3, "viks");
		map.put(4,"puji");
		
		System.out.println(map);
		System.out.println(map.get(3));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.size());
		for (Object object :map.values()) {
			System.out.println(object);
			
		}
	}
}
