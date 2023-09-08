package in.co.rays;

public class arr {
	public static void main(String[] args) {
		int [] arr= {11,20,16,18,2};
		int a=0;
		int b=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>b) {
				a = b;
				b = arr[i];
				
			}
			if(arr[i]<b && arr[i]>a) {
				a=arr[i];
			}
			
		}
		System.out.println(a);
	}

}
