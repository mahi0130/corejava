package tread.com;

public class Withtread extends Thread {
	String name = null;
	int i = 1;
	public Withtread (String name ) {
		this.name= name;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
				
		}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+" "+name);
			i++;
		}
	
	}
	
}
