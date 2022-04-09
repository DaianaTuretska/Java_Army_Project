package com.company;

import com.company.interfaces.IAviation;

public class Aviation extends Equipment implements IAviation {

    private String category;
    private int power;

    Aviation() {
    }

    public Aviation(String name, String category, int countEquipment, int power) {

        super(name, countEquipment);
        this.category = category;
    }

    public void display() {
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

    @Override
    public void takeoff() {
        System.out.println("The plane takeoff!");
    }

    @Override
    public void landing() {

        System.out.println("The plane landing!");
    }
}
