package com.company;

import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
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
    final StringBuilder info =  new StringBuilder("Tanks:"+"name: " + getName() + " , category:" + category + " , damage:" + damage);
    Stream.of(category).forEach(faculty -> info.append("\n").append(category));
    return info.toString();
}
    final void TanksMethod(String[] arg) {
        System.out.println("Tanks ready!");
    }

    public void display() {
    }
}
