package in.co.rays;

public class Rectangle2 extends Shape1{
	private int length = 0;
	private int width = 0 ;
	
	public void setlength(int length) {
		this.length = length;
	}
	public int getlength() {
		return length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getwidth() {
		return width;
	}
	
	public void area() {
		int area = getlength()*getwidth();
		System.out.println("Rectangle area="+area);
	}
}
