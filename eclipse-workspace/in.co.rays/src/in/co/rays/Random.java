package in.co.rays;

public class Random {
	
	public static void main(String[] args) {
		
		// define the range
		int max = 100;
		int min = 1;
		int range = max - min + 1;
		
       for (int i = 0; i < 5; i++) {
    	   int rand = (int)( Math.random()* range)+min;
    	   
    	   System.out.println(rand);
	
}
	}

}
