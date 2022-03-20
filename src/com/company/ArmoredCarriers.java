package com.company;

public class ArmoredCarriers extends Equipment {

    private String category;
    private String combat_module;
    private int power_reserve;

    public ArmoredCarriers(String name, String category, String combat_module, int countEquipment, int power_reserve) {

        super(name, countEquipment);
        this.category = category;
        this.power_reserve = power_reserve;
        this.combat_module = combat_module;
    }

    public void display() {

    }

    public String getCategory() {
        return category;
    }

    public String getCombat_module() {
        return combat_module;
    }

    public int getPower_reserve() {
        return power_reserve;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCombat_module(String category) {
        this.combat_module = combat_module;
    }

    public void setPower_reserve(int power_reserve) {
        this.power_reserve = power_reserve;
    }

    public String toString() {
        return "name: "+ getName() + ", category: "  + category + " , combat module: " + combat_module + " , power reserve: "+power_reserve + "km";
    }
}

