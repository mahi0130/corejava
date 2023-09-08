package tread.com;

public class Account {
	private int balance = 0;
	public void setBalance(int balance) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		this.balance=balance;
	}
	public int getbalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}
	public synchronized void deposite (String msg, int amount) {
		int total = getbalance()+amount;
		setBalance(total);
		System.out.println(msg+"balance=" + getbalance());
		
	}
	
}
