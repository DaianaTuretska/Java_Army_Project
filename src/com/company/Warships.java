package com.company;

public class Warships extends Equipment {

    private String category;
    private int water_tonnage;

    public Warships(String name, String category, int countEquipment, int water_tonnage) {

        super(name, countEquipment);
        this.category = category;
        this.water_tonnage = water_tonnage;
    }

    public void display() {

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

    public static void main(String args[]) {
        Warships s1 = new Warships("М361«Balta»", "Minelayer", 40, 27000);
        Warships s2 = new Warships("P170«Skadovsk»", "Patrol boat", 60, 70000);
        Warships s3 = new Warships("A500«Dombas»", "Control ship", 80, 17000);


        System.out.println(s1);
        System.out.println(s2);
    }
}

