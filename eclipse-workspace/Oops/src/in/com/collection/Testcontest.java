package in.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Testcontest {
	public static void main(String[] args) {
		ArrayList<Contestant>list=new ArrayList<Contestant>();
		list.add(new Contestant("Mahi","9285156792"));
		list.add(new Contestant("Bharti","7828207509"));
		list.add(new Contestant("Muskan","74440279660"));
		list.add(new Contestant("KAnak","9725151652"));
		list.add(new Contestant("khushboo","3322211160"));
		list.add(new Contestant("uday","9589359987"));
		
		System.out.println("winners!!!");
		list.stream().map(e-> e.name).distinct().collect
		(Collectors.collectingAndThen(Collectors.toList(),e->
		{
			Collections.shuffle(e);
			return e.stream();
		})).limit(2).forEach(e->{
			System.out.println(e);
			
		});
	
	
	}
}
	class Contestant {
		public String name = null;
		public String phone= null;
		
		public Contestant(String n,String p) {
			this.name=n;
			this.phone=p;
		}
	}
