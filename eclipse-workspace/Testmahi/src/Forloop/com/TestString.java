package Forloop.com;

public class TestString {
	public static void main(String[] args) {
		String name = "Mahi singh";
		System.out.println("String length="+name.length());
		System.out.println("name 8 char is="+name.charAt(8));
		System.out.println(name.codePointAt(2));
		System.out.println(name.codePointCount(3, 4));
		System.out.println();
	}
}
