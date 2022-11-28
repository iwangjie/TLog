package com.yomahub.tlog.exception;

/**
 * 说明
 *
 * @author 王杰
 * So close, so far away
 */
public class UtilException extends RuntimeException{

    public UtilException () {
    }

    public UtilException (final String message) {
        super(message);
    }

    public UtilException (final String message, final Throwable cause) {
        super(message, cause);
    }

    public UtilException (final Throwable cause) {
        super(cause);
    }

    public UtilException (final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
