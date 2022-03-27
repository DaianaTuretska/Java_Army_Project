package com.company;

public class AirForce extends Army {
    private int battalions;
    private String equipment;

    AirForce() {
    }

    public AirForce(String name, int battalions, int countPerson, String equipment) {

        super(name, countPerson);
        this.battalions = battalions;
        this.equipment = equipment;
    }

    public AirForce(String name, int countPerson) {
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
        return "name:" + getName() + ", count person:" + getCountPerson() + ", battalions" + battalions + ", equipment" + equipment;
    }

    public void display() {
    }
}

