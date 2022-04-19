package com.company;

import com.company.interfaces.IPredicateTanks;

public class Tanks extends Equipment  {

    private String category;
    private int damage;

    Tanks() {
    }

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

    public int damage(int damage) {
        IPredicateTanks<Integer> isPositive = x -> x > 50;
        return damage;
    }

    public String toString() {
        return "name: " + getName() + " , category:" + category + " , damage:" + damage;
    }

    final void TanksMethod(String[] arg) {
        System.out.println("Tanks ready!");
    }

    public void display() {
    }
}
