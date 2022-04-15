package com.company.enums;

public enum ShipsCategory {
    COMBAT("Combat boats"),
    PURPOSE("Special purpose ships"),
    HYDRO("Hydrographic ships"),
    DIVING("Diving vessels"),
    HOSPITAL("Hospital ships");
    private final String value;

    ShipsCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
