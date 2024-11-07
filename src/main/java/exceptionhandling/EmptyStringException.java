package exceptionhandling;

import java.security.cert.Extension;

public class EmptyStringException extends Exception {

    public EmptyStringException(String message) {
        super(message);
    }
    public EmptyStringException(Exception e) {
        super(e);
    }

}
