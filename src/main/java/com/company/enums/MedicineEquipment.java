package com.company.enums;

public enum MedicineEquipment {
    DEFIBRILLATOR("defibrillator"),
   RESPIRATOR("respirator"),
    SURGICAL("Sets of surgical instruments"),
    ANESTHESIOLOGY("devices for anesthesiology");

    private final String description;

    private MedicineEquipment(String description) {
        this.description = description;
    }

    public String getValue() {
        return description;
    }
}
