package com.company;

import com.company.interfaces.IWeapons;
import com.company.enums.WeaponsCategory;

public class InfantryWeapons extends Equipment {

    private WeaponsCategory category;
    private int power;

    InfantryWeapons() {
    }

    public InfantryWeapons(String name, WeaponsCategory category, int countEquipment, int power) {
        super(name, countEquipment);
        this.category = category;
    }

    public WeaponsCategory getCategory() {
        return category;
    }

    public int getPower() {
        return power;
    }

    public void setCategory(WeaponsCategory category) {
        this.category = category;
    }

    public void setPower(int power) {
        this.power = power;
    }


    public String toString() {
        return "name: " + getName() + " , category:" + category + " , power:" + power + "mm";
    }

    public void display() {
    }
}

