package in.co.rays;

public class Testshape2 {
	public static void main(String[] args) {
		 Shape1 s = new Rectangle2();
		 Rectangle2 r = (Rectangle2) s;
		 
		 r.setlength(10);
		 r.setWidth(20);
		 
		 s.area();
	}

}
