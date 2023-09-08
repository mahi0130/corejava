package testshivamsir;

public class Primenumber {
	public static void main(String[] args) {
		int a = 20;
		int count=0;
		for (int i = 2; i < a; i++) {
			if (a%i==0) {
				count++;
			}
			
		}
		if (count==0) {
			System.out.println("prime number");
			
		}else {
			System.out.println("not prime number");
			}
		
	}
}

