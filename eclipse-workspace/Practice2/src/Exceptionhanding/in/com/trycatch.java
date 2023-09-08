package Exceptionhanding.in.com;

public class trycatch {
	public static void main(String[] args) {
		try {
			int  a = 10;
		int b = 2;
		int c = a/b;
		System.out.println("division = "+c);
		String name = ("Mahi");
		System.out.println(name.charAt(10));
		
		
	}
		catch(Exception e){
			e.printStackTrace();		
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("discount");
}
}