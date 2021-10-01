package model.exceptions;

public class NullOfNegatiefException extends Exception {
    public NullOfNegatiefException() {
    }

    public NullOfNegatiefException(String message) {
        super(message);
    }

    public NullOfNegatiefException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullOfNegatiefException(Throwable cause) {
        super(cause);
    }

    public NullOfNegatiefException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
