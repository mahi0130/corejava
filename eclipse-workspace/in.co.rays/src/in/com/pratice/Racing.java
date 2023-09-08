package in.com.pratice;

public class Racing extends Thread{
	String name = null;
	
	static Account account= new Account();
	public Racing (String name ) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i =1; i <= 5;i++) {
			this.account.deposite(name, 10000);
		}
		
	}
}
