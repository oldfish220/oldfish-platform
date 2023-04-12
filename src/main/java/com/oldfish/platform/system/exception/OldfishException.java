package com.oldfish.platform.system.exception;

public class OldfishException extends RuntimeException {

    public OldfishException() {}

    public OldfishException(String message) {
        super(message);
    }

    public OldfishException(String message, Throwable cause) {
        super(message, cause);
    }

    public OldfishException(Throwable cause) {
        super(cause);
    }

    public OldfishException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
