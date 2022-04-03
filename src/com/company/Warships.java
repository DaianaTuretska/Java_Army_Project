package com.company;

import com.company.exeptions.CountEquipException;
import com.company.exeptions.WarShipsException;
import com.company.interfaces.IWarship;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Warships extends Equipment implements IWarship {
    private static final Logger LOGGER = Logger.getLogger(Warships.class);

    private String category;
    private int water_tonnage;

    Warships() {
    }

    public Warships(String name, String category, int countEquipment, int water_tonnage) {

        super(name, countEquipment);
        this.category = category;
        this.water_tonnage = water_tonnage;
    }

    public String getCategory() {
        return category;
    }

    public int getWater_tonnage() {
        return water_tonnage;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setWater_tonnage(int water_tonnage) {
        this.water_tonnage = water_tonnage;
    }

    public String toString() {
        return getName() + "" + category + " " + water_tonnage + "ton";
    }

    public int waterTonnage(int water_tonnage){
        if (water_tonnage > 10000) {
            this.water_tonnage = water_tonnage;
        } else {
            System.out.println("Count Equipment not must be > 10000");
            try {
                throw new WarShipsException();
            } catch (WarShipsException e) {
                e.printStackTrace();
                LOGGER.debug(e.getMessage());
            }
        }
        return water_tonnage;
    }
    @Override
    public void arrived_at_port() {
        System.out.println("The ship arrived at the port!");
    }

    @Override
    public void sailed() {
        System.out.println("The ship sailed!");
    }

    public void display() {
    }
}

