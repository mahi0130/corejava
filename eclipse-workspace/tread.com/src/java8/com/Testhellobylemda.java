package java8.com;

public class Testhellobylemda {
	public static void main(String[] args) {
		hello1 h = (a,b)-> {
			int c = a+b;
			System.out.println("sum = " + c);
		};
		h.sum(10, 20);
	}
}
