package com.company;

public class ArmoredCarriers extends Equipment {

    private String category;
    private String combatModule;
    private int powerReserve;

    ArmoredCarriers() {
    }

    public ArmoredCarriers(String name, String category, String combat_module, int countEquipment, int power_reserve) {

        super(name, countEquipment);
        this.category = category;
        this.powerReserve = powerReserve;
        this.combatModule = combatModule;
    }

    public String getCategory() {
        return category;
    }

    public String getCombatModule() {
        return combatModule;
    }

    public int getPowerReserve() {
        return powerReserve;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCombatModule(String category) {
        this.combatModule = combatModule;
    }

    public void setPowerReserve(int powerReserve) {
        this.powerReserve = powerReserve;
    }

    final void CarriesMethod(String[] arg) {
        System.out.println("ArmoredCarriers!");
    }

    public String toString() {
        return "name: " + getName() + ", category: " + category + " , combat module: " + combatModule + " , power reserve: " + powerReserve + "km";
    }

    public void display() {
    }
}

