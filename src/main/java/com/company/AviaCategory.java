package com.company;

public enum AviaCategory {
    BOMBING("Bombing"),
    ASSAULT("Assault"),
    FIGHTER("Fighter");
    private final String value;
    AviaCategory(String value){
        this.value=value;
    }
    public  String getValue(){
        return  value;
    }
}
