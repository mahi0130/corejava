package testshivamsir;

public class Firstlargest {
 public static void main(String[] args) {
	int [] arr = {1,10,20,15,8};
	int a = 0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>a) {
			a=arr[i];
		}
		
	}System.out.println(a);
	
}
}
