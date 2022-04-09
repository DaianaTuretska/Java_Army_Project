package com.company;

import com.company.exeptions.WarShipsException;
import com.company.interfaces.IWarship;
import org.apache.log4j.Logger;


public class Warships extends Equipment implements IWarship {
    private static final Logger LOGGER = Logger.getLogger(Warships.class);

    private String category;
    private int waterTonnage;

    Warships() {
    }

    public Warships(String name, String category, int countEquipment, int water_tonnage) {

        super(name, countEquipment);
        this.category = category;
        this.waterTonnage = water_tonnage;
    }

    public String getCategory() {
        return category;
    }

    public int getWaterTonnage() {
        return waterTonnage;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setWaterTonnage(int waterTonnage) {
        this.waterTonnage = waterTonnage;
    }

    public String toString() {
        return getName() + "" + category + " " + waterTonnage + "ton";
    }

    public int waterTonnage(int waterTonnage){
        if (waterTonnage > 10000) {
            this.waterTonnage = waterTonnage;
        } else {
            System.out.println("Count Equipment not must be > 10000");
            try {
                throw new WarShipsException();
            } catch (WarShipsException e) {
                e.printStackTrace();
                LOGGER.debug(e.getMessage());
            }
        }
        return waterTonnage;
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

