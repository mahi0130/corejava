package in.com.pratice;

public class LoginException extends RuntimeException {
	public LoginException() {
		super("Invalid user");
	}
}
