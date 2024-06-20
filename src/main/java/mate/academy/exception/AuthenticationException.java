package mate.academy.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Exception e) {
        super(message, e);
    }
}
