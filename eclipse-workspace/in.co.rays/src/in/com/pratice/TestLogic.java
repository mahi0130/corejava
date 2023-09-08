package in.com.pratice;

public class TestLogic {
public static void main(String[] args) {
	String name ="Rays";
	
	if(name.equals("Rays")) {
		System.out.println("valid user");
	}
	else {
		LoginException e = new LoginException();
		try {
			throw e;
		} catch (LoginException e2) {
			System.out.println(e);
		}
	}
}
}
