package in.co.oops;

public class Tringle extends Shape{
	private int base = 0;
	private int hight = 0;
	
	
	public Tringle () {
		
	}
		public Tringle(int base,int hight) {
			this.base = base;
			this.hight = hight;
		}
		public void setBase(int base) {
			this.base= base;
		}
		public int getBase() {
			return base;
		}
		public void sethight(int hight) {
			this.hight = hight;
		}
		
		public int gethigth() {
			return hight;
		}
		public  void area () {
			   double area = (base*hight)/2;
				System.out.println("tringle area="+area);

}
}
