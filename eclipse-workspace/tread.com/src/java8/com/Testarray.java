package java8.com;

import java.util.Arrays;

public class Testarray {
	public static void main(String[] args) {
		int[]arr = {10,20,30,40,50};
		Arrays.parallelSort(arr);
		for (int i : arr) {
			System.out.println(i);
			
		}
	}
}
