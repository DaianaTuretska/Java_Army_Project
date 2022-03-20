package com.company;

public abstract class Rank{

    private String name;

    public String getName() { return name; }

    public void setName(String name) {this.name = name;}

    public Rank(String name){
        this.name=name;
    }

    public abstract void display();

    public String toString(){
        return name;
    }
}

