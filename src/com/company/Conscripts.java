package com.company;

public class Conscripts extends Person {

    private boolean suitable;
    private String address;
    private String phone;

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

    public int Age(int year_birthday) {
        int year_now = 2022;
        return year_now - year_birthday;
    }

    public String toString() {
        return "Name: " + getName() + " , Lastname: " + getLastname() + " " + ", suitable:" + suitable + ", address :" + address + ", phone:" + phone + ", age" + Age(1990);
    }

    public void display() {
        System.out.println(toString());
    }
}


