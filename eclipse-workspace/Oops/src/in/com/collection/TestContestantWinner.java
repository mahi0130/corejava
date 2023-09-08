package in.com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestantWinner {
	public static void main(String[] args) {
		ArrayList<ContestantWinner>list=new ArrayList<ContestantWinner>();
		list.add(new ContestantWinner("raj","9167890222"));
		list.add(new ContestantWinner("vaishu","9167890222"));
		list.add(new ContestantWinner("sonya","8945678908"));
		list.add(new ContestantWinner("siman","91567890222"));
		list.add(new ContestantWinner("vedika","9167890222"));
		list.add(new ContestantWinner("arshia","9167890222"));
		list.add(new ContestantWinner("chetan","9167890222"));
		list.add(new ContestantWinner("abc","12345"));
		list.stream().map(e-> e.phone).filter(e->e.length()== 10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e->
		{
			//Collections.shuffle(e);
			//return e.stream();
		})).limit(2).forEach(e->{
			System.out.println(e);
		});
		
	}
		
	}




class ContestantWinner{
	String name =null;
	String phone = null;
	public ContestantWinner(String name,String phone) {
		this.name=name;
		this.phone=phone;
	}

}
