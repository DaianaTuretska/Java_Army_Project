package com.company;

public abstract class Rank {

    private String name;

    Rank() {
    }
    public Rank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public abstract void display();

}

