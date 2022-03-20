package com.company;

public class InfantryWeapons extends Equipment {

    private String category;
    private int power;

    public InfantryWeapons(String name, String category, int countEquipment, int power) {

        super(name, countEquipment);
        this.category = category;
    }


    public String getCategory() {
        return category;
    }

    public int getPower() {
        return power;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString() {
        return "name: "+getName() + " , category:" + category + " , power:" + power + "mm";
    }

    public void display() {

    }
}

