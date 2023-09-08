package in.co.oops;

public class Testshape {
 public static void main(String[] args) {
	Shape []s = new Shape[3];
	
	s[0]= new Rectangle (10,20);
	s[1]= new Tringle (10,20);
	s[2]= new Circle(10);
	
	for (int i = 0; i < s.length; i++) {
		s[i].area();
		
	}
	
	
 }
}
