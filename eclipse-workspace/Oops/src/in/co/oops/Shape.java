package in.co.oops;

public class Shape {
	private String color = null;
	private int boderwidth = 0;
	
	public Shape() {
		
	}
	
	public Shape (String color, int boderwidth) {
		this.color = color;
		this.boderwidth = boderwidth;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public String getcolor() {
		return color;
	}
	public void setboderWidth(int boderwidth) {
		this.boderwidth = boderwidth;
	}
	
	public int getboderWidth() {
		return boderwidth;
	}
	
	public  void area () {
		
		System.out.println("shape area method");
	}

}
