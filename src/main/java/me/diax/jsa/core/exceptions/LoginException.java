package me.diax.jsa.core.exceptions;

/**
 * Created by Comportment on 23/04/17.
 * <p>
 * no u
 */
public class LoginException extends SkypeException {

    public LoginException() {
        super("Could not login.");
    }

    public LoginException(String message) {
        super(message);
    }

    public LoginException(Throwable throwable) {
        super(throwable);
    }

    public LoginException(String message, Throwable throwable) {
        super(message, throwable);
    }

    protected LoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}