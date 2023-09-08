package in.com.exception;

public class Testpropogation {
	public static void main(String[] args)  {
		dad();
	}
	public static void dad() {
		try {
			mom();
		} catch (MistakeException e) {
						e.printStackTrace();
		}
	}public static void mom() throws MistakeException {
		son();
	}public static void son() throws MistakeException {
		throw new MistakeException();
	}

}
