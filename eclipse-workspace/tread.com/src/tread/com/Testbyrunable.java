package tread.com;

public class Testbyrunable {
	public static void main(String[] args) {
		Byrunable b1= new Byrunable("classmate");
		Byrunable b2= new Byrunable("pulse");
		
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b2);
		t1.start();
		t2.start();
		
	}
}
