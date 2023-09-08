package in.com.exception;

public class Trycatch {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 2;
			int c= a/b;
			System.out.println("division ="+c);
			String name= ("mahi");
			System.out.println(name.charAt(15));
		}catch (Exception e) {
		e.printStackTrace();	
		}
			
			finally {
				System.out.println("finally block");
			}
	System.out.println("discount");
	}
}
	


