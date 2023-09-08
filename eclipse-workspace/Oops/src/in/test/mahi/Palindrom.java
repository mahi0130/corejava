package in.test.mahi;

public class Palindrom {
	public static void main(String[] args) {
		
	int a = 151;
	int b=a;
	int c=0;
	int d;
	
	while(b>c) {
		d=b%10;
		c=c*10+d;
		b=b/10;
		
	}if (a==c) {
		System.out.println("number is palindrom");
	}else {
		System.out.println("number is not paindrom");
	}
	}

}
