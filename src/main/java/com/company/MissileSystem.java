package com.company;

public class MissileSystem extends Equipment {

    private String category;
    private int power;

    MissileSystem() {
    }

    public MissileSystem(String name, String category, int countEquipment, int power) {
        super(name, countEquipment);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void display() {
    }
}
