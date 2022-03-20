package com.company;

public enum AviaCategory {
    BOMBING("Bombing"),
    assault("Assault"),
    fighter("Fighter");
    private final String value;
    AviaCategory(String value){
        this.value=value;
    }
    public  String getValue(){
        return  value;
    }
}
