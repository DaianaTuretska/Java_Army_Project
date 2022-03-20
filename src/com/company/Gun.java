package com.company;

public class Gun extends Equipment {

    private String category;
    private int caliber;

    public Gun(String name, String category, int countEquipment, int caliber) {

        super(name, countEquipment);
        this.category = category;
        this.caliber = caliber;
    }

    public void display() {

    }

    public String getCategory() {
        return category;
    }

    public int getCaliber() {
        return caliber;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public String toString() {
        return "name: "+getName() + " , category" + category + " , caliber:" + caliber;
    }
}

