package in.co.rays;

public class Shape {
	
	private String color = null;
	private int boderwidth = 0;
	
	
	public Shape() {
		System.out.println("mahi");
	}
	
	public Shape(String color, int boderwidth) {
		System.out.println("singh");
		
	}
	
	public void setcolor(String color) {
	this.color = color;
}
	
	public String getcolor() {
		return color;
	}
	
	public void setBoderwidth (int boderwidth) {
		this.boderwidth = boderwidth;
	}
	
	public int getBoderwidth() {
		return boderwidth;
	}
}