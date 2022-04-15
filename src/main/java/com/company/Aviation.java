package com.company;

import com.company.enums.AviaCategory;
import com.company.interfaces.IAviation;

public class Aviation extends Equipment implements IAviation {

    private AviaCategory category;
    private int power;

    Aviation() {
    }

    public Aviation(String name, AviaCategory category, int countEquipment, int power) {
        super(name, countEquipment);
        this.category =category;
    }

    public void display() {
    }

    public AviaCategory getCategory() {
        return this.category;
    }

    public int getPower() {
        return power;
    }

    public void setCategory(AviaCategory category) {
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
    public String toString()
    {
        return
                " category: "+ category+
                " power: " + power ;
    }
}
