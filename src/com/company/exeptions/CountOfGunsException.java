package com.company.exeptions;

public class CountOfGunsException extends Exception{

    public CountOfGunsException() {
        }

    public CountOfGunsException(String message) {
            super(message);
        }

    public CountOfGunsException(String message, Throwable cause) {
            super(message, cause);
        }

    public CountOfGunsException(Throwable cause) {
            super(cause);
        }

    public CountOfGunsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }

