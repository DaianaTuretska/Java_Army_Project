package com.company;

public abstract class Army {

    private String name;
    private int countPerson;

    Army() {
    }
    public Army(String name, int countPerson) {
        this.name = name;
        this.countPerson = countPerson;
    }
    public String getName() {
        return name;
    }

    public int getCountPerson() {
        return countPerson;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountPerson(String countPerson) {
        this.name = countPerson;
    }



    public abstract void display();

    public String toString() {
        return name + countPerson;
    }
}

