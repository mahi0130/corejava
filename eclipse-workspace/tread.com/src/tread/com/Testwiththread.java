package tread.com;

public class Testwiththread {
	public static void main(String[] args) {
		Withtread t1 = new Withtread("All is good");
		t1.setDaemon(true);
		t1.start();
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"main");
			
		}
	}
}
