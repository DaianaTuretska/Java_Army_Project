package com.company.exeptions;


public class WarShipsException extends Exception {
    public WarShipsException() {
            super("Count Equipment not must be > 10000");
        }
    }

