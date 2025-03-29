package adventure.exception;

public class BossNotMatchException extends RuntimeException {

    public BossNotMatchException() {
    }

    public BossNotMatchException(String s) {
        super(s);
    }

    public BossNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public BossNotMatchException(Throwable cause) {
        super(cause);
    }

    public BossNotMatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
