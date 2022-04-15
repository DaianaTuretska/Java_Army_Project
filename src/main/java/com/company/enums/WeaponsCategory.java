package com.company.enums;

public enum WeaponsCategory {
    RIFLES("Rifles"),
    HANDGUN("Handgun"),
    SHOTGUN("Shotgun");
    private final String value;

    WeaponsCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
