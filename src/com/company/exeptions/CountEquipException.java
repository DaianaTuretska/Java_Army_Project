package com.company.exeptions;

public class CountEquipException extends Exception{

    public CountEquipException() {
        }

    public CountEquipException(String message) {
            super(message);
        }

    public CountEquipException(String message, Throwable cause) {
            super(message, cause);
        }

    public CountEquipException(Throwable cause) {
            super(cause);
        }

    public CountEquipException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }

