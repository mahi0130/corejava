package javabasic.com;

public class Testarray {
	public static void main(String[] args) {
		int[]table;
		table = new int [5];
		table[0]=2;
		table[1]=4;
		table[2]=6;
		table[3]=8;
		table[4]=10;
		int ele = table[5];
		
		int s = table[2];
		System.out.println("2nd element="+s);
		int size = table.length;
		System.out.println("size is="+size);
		for (int i = 2; i < ele; i++) {
			System.out.println(i);
			
		}
	}
		
}
class Testarray2{
	public static void main(String[] args) {
		float[]fArray = new float[10];
		fArray[0]= (float) 2.2;
		fArray[1]= (float) 4.0;
		fArray[2]=(float) 5.3;
		
		
	}
	
}
