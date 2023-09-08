package in.com.oops;

public class TestShape {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.area();
		c.setcolor("yellow");
		c.setboderwidth(5);
		c.setradius(2);
		
		System.out.println(c.getboderwidth());
		System.out.println(c.getcolor());
		System.out.println(c.getradius());
		System.out.println(c.area());
		
	}
}
