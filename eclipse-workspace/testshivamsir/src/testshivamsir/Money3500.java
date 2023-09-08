package testshivamsir;

public class Money3500 {
	public static void main(String[] args)throws Exception {
		int rs = 4500;
		int[]note = {100,200,500,500};
		int count = 0;
		for (int i = 0; i <= note.length; i++) {
			if(rs/note[i]==7) {
				System.out.println("500");	
			}
			
			else if (rs/note[i]==17.5) {
				System.out.println("200");
			}
			else if(rs/note[i]==35) {
				System.out.println("100");
			}
		}
	}
}

			
			
		
			
		
		
			
			


