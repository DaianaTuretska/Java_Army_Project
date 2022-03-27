package com.company;

public class Warships extends Equipment implements IWarship {

    private String category;
    private int water_tonnage;

    Warships() {
    }

    public Warships(String name, String category, int countEquipment, int water_tonnage) {

        super(name, countEquipment);
        this.category = category;
        this.water_tonnage = water_tonnage;
    }

    public String getCategory() {
        return category;
    }

    public int getWater_tonnage() {
        return water_tonnage;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setWater_tonnage(int power) {
        this.water_tonnage = power;
    }

    public String toString() {
        return getName() + "" + category + " " + water_tonnage + "ton";
    }

    @Override
    public void arrived_at_port() {
        System.out.println("The ship arrived at the port!");
    }

    @Override
    public void sailed() {
        System.out.println("The ship sailed!");
    }

    public void display() {
    }
}

