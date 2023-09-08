package java8.com;

public interface hello1 {
	public void sum (int a , int b );
	public default void defmethod () {
		System.out.println("default method");
	}
	public static void staticmethod() {
		System.out.println(" static method.!!!!!!!!!!");
	}
}
