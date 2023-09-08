package in.test.mahi;

public class Divisiableby7 {
	public static void main(String[] args) {
		int a = 1;
		int b = 200;
		int sum=0;
		int c;
		
		for (int i = a; i <=b; i++) 
			if(i%7==0) {
				c=i;
				System.out.println(c);
			 	sum= sum + c;
			 	}
			System.out.println("sum="+sum);
			
		}
	}


