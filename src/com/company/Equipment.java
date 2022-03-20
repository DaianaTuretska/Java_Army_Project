package com.company;

public abstract class Equipment {

    private String name;
    private int countEquipment;

    public String getName() {
        return name;
    }

    public int getCountEquipment() {
        return countEquipment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountEquipment(String countEquipment) {
        this.name = countEquipment;
    }

    public Equipment(String name, int countEquipment) {

        this.countEquipment = countEquipment;
        this.name = name;
    }

    public String toString() {
        return name + " " + countEquipment;
    }

    public abstract void display();
}

