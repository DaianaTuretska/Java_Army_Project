package com.company;
import org.apache.log4j.Logger;
import com.company.interfaces.IGun;

public class Gun extends Equipment implements IGun {
    private static final Logger LOGGER = Logger.getLogger(Gun.class);
    private String category;
    private int caliber;

    Gun() {
    }

    public Gun(String name, String category, int countEquipment, int caliber) {

        super(name, countEquipment);
        this.category = category;
        this.caliber = caliber;
    }


    @Override
    public void charge() {
        System.out.println("The gun charge!");
    }

    @Override
    public void shot() {
        System.out.println("The gun shoot!");
    }

    public String getCategory() {
        return category;
    }

    public int getCaliber() {
        return caliber;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public String toString() {
        return "name: " + getName() + " , category" + category + " , caliber:" + caliber;
    }

    public void display() {
    }
}

