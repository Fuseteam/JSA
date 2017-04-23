package me.diax.jsa.core.exceptions;

/**
 * Created by Comportment on 23/04/17.
 * <p>
 * Don't follow this command.
 */
public class SkypeException extends RuntimeException {

    static final long serialVersionUID = -4872577229607095236L;

    public SkypeException() {
        super("No specific details were given.");
    }

    public SkypeException(String message) {
        super(message);
    }

    public SkypeException(Throwable throwable) {
        super(throwable);
    }

    public SkypeException(String message, Throwable throwable) {
        super(message, throwable);
    }

    protected SkypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}