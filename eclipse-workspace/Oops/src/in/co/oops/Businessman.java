package in.co.oops;

public class Businessman implements Richman,Socialworker {

	

	@Override
	public void helptoother() {
		System.out.println("helptoothers");		
	}

	@Override
	public void earnmoney() {
		System.out.println("eaarnmoney");
		
	}

	@Override
	public void party() {
		System.out.println("party");
		
	}

	@Override
	public void donation() {
		System.out.println("donation");
		
	}
	

}
