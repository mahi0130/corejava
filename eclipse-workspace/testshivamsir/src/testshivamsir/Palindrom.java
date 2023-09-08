package testshivamsir;

public class Palindrom {
	public static void main(String[] args) {
		int a = 171;
		int b =0;
		int c;
		while(a>0) {
			c = a%10;
			b= b%10+c;
			int d = b;
			
		}
		if(a==b) {
			System.out.println("number is palindrom");
			
		}else {
			System.out.println("number is not palindrom");
		}
	}

}
