package tread.com;

public class Daemonthread extends Thread {
	public void run() {
		System.out.println("Daemon t started"+ Thread.currentThread());
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("main started");
		Daemonthread t = new Daemonthread();
		t.setDaemon(true);
		t.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("leaving main method");
		System.out.println("now jvm will exits");
	}
	
}
