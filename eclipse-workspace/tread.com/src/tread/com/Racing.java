package tread.com;

public class Racing extends  Thread{
	String name = null;
	public static Account a = new Account();
	public Racing(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			a.deposite(name, 1000);
		}
	}
	
}
