package in.co.rays;

public class testswitch {
	public static void main(String[] args) {
		int value =2;
		int a=10;
		int b=20;
		switch (value) {
		case 1:
			int c= a+b;
			System.out.println("sum="+c);
			break;
		case 2:
			int d= a-b;
			System.out.println("sum="+d);
			break;
	

		default:
			System.out.println("javasa");
			break;
		}
	}

}
