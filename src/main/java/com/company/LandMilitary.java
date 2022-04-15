package com.company;

public class LandMilitary extends Army {

    private int battalions;
    private String equipment;

    LandMilitary() {
    }

    public LandMilitary(String name, int countPerson, int battalions, String equipment) {
        super(name, countPerson);
        this.battalions = battalions;
        this.equipment = equipment;
    }

    public LandMilitary(String name, int countPerson) {
        super(name, countPerson);
    }

    public int getBattalions() {
        return battalions;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setBattalions(int battalions) {
        this.battalions = battalions;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String toString() {
        return "name:" + getName() + " , count person:" + getCountPerson() + " , battalions: " + battalions + ", equipment:" + equipment;
    }

    public void display() {
    }
}

