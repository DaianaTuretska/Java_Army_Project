package com.company.exeptions;

public class AgeNotMustBeNullException extends Exception{
    public AgeNotMustBeNullException() {
        super("Age not must be 0");
    }

}
