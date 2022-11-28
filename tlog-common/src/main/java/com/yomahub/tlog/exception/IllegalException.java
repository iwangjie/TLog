package com.yomahub.tlog.exception;

/**
 * 说明
 *
 * @author 王杰
 * So close, so far away
 */
public class IllegalException extends RuntimeException {

    private static final long serialVersionUID = 8247610319171014183L;

    public IllegalException() {
        super();
    }

    public IllegalException(String message) {
        super(message);
    }

    public IllegalException(Throwable e) {
        super(e.getMessage(), e);
    }

    public IllegalException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public IllegalException(String message, Throwable throwable, boolean enableSuppression, boolean writableStackTrace) {
        super(message, throwable, enableSuppression, writableStackTrace);
    }

}
