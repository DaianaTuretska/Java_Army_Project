package com.company;

import com.company.exeptions.AgeNotMustBeNullException;
import com.company.exeptions.CountEquipException;
import org.apache.log4j.Logger;
public abstract class Equipment {
    private static final Logger LOGGER = Logger.getLogger(Equipment.class);
    private String name;
    private int countEquipment;

    Equipment() {
    }

    public String getName() {
        return name;
    }

    public int getCountEquipment() {
        return countEquipment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountEquipment(String countEquipment) {
        this.name = countEquipment;
    }

    public Equipment(String name, int countEquipment) {

        this.countEquipment = countEquipment;
        this.name = name;
    }
    public int setCountEquipment(int countEquipment){
        if (countEquipment > 0) {
            this.countEquipment = countEquipment;
        } else {
            System.out.println("Count Equipment not must be 0");
            try {
                throw new CountEquipException();
            } catch (CountEquipException e) {
                e.printStackTrace();
                LOGGER.debug(e.getMessage());
            }
        }
        return countEquipment;
    }

    public String toString() {
        return name + " " + countEquipment;
    }

    public abstract void display();
}

