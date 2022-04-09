package com.company;

import com.company.exeptions.AgeNotMustBeNullException;
import org.apache.log4j.Logger;
public class Conscripts extends Person {

    private static final Logger LOGGER = Logger.getLogger(Conscripts.class);
    private boolean suitable;
    private String address;
    private String phone;
    private int age;

    Conscripts() {
    }

    public Conscripts(String name, String lastname, String address, String phone, int year_birthday, boolean suitable) {

        super(name, lastname, year_birthday);
        this.address = address;
        this.suitable = suitable;
        this.phone = phone;

    }

    public String getAddress() {
        return address;
    }

    public boolean getSuitable() {
        return suitable;
    }

    public String getPhone() {
        return phone;
    }

    public void setSuitable(boolean suitable) {
        this.suitable = suitable;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int Age(int yearBirthday) {
        int yearNow = 2022;
        int age;
        age = yearNow - yearBirthday;
        return age;
    }
    public int setAge(int age){
        if (age > 18) {
        this.age = age;
    } else {
        System.out.println("Age not must be > 18");
        try {
            throw new AgeNotMustBeNullException();
        } catch (AgeNotMustBeNullException e) {
            e.printStackTrace();
            LOGGER.debug(e.getMessage());
        }
    }
        return age;
    }
    public String toString() {
        return "Name: " + getName() + " , Lastname: " + getLastname() + " " + ", suitable:" + suitable + ", address :" + address + ", phone:" + phone + ", age" + Age(1990);
    }

    public void display() {
        System.out.println(toString());
    }
}


