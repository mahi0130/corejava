package Exceptionhanding.in.com;

public class Testaccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.deposite(5000);
		try {
			a.withdrawl(3000);
		} catch (insufficientfund e) {
			System.out.println(e);
		}
		a.deposite(10000);
	}

}
