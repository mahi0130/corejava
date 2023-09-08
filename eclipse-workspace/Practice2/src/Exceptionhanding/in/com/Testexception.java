package Exceptionhanding.in.com;

public class Testexception {
	public static void main(String[] args) {
		dad();
	}

	private static void dad() {
		try {
			mom();
		} catch (Mistakeexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void mom() throws Mistakeexception {
		son();
	}

	private static void son() throws Mistakeexception {
		throw new Mistakeexception();
	}


}
