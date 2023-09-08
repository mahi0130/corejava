package Enumration;

import java.util.Arrays;
import java.util.stream.Stream;

public class Teststeam1 {
public static void main(String[] args) {
	String[]arr= {"one","two","three","four"};
	Stream<String>s=Arrays.stream(arr);
	s.forEach( e->{
		System.out.println(e);
	});
}
}
