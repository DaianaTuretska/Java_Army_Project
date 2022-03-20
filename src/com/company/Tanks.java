package com.company;

public class Tanks extends Equipment {

    private String category;
    private int damage;

    public Tanks(String name, String category, int countEquipment, int damage) {

        super(name, countEquipment);
        this.category = category;
        this.damage = damage;
    }

    public String getCategory() {
        return category;
    }

    public int getDamage() {
        return damage;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPower(int power) {
        this.damage = power;
    }

    public String toString() {
        return "name: "+ getName() + " , category:" + category + " , damage:" + damage;
    }

    public void display() {

    }
}
