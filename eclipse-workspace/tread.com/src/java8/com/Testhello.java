package java8.com;

public class Testhello {
	public static void main(String[] args) {
		hello h = new hello() {

			@Override
			public void sum() {
				System.out.println("sum method.!!!!!!");				
			}
			
		};
		h.sum();
	}
}
