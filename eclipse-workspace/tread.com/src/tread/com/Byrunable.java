package tread.com;

public class Byrunable implements Runnable{
	String name = null;
	public Byrunable(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
	System.out.println(i+" "+name);
	
}		
	}
}
