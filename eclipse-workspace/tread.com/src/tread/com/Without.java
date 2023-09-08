package tread.com;

public class Without {
	String name = null;
	public Without (String name) {
		this.name=name;
	}
	public void run () {
		for (int i = 1; i <=5; i++) {
			System.out.println(i+" "+name);
			
		}
	}
}
