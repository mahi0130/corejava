package in.co.rays;

public class fibonnaci {
	public static void main(String[] args) {
		int m= 0;
		int h=1;
		System.out.println(m+"\t "+h);
		for (int i = 0; i < 10; i++) {
			int z= m+h;
			m=h;
			h=z;
			System.out.println(z);
			
		}
	}

}
