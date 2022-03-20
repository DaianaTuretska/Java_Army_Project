package com.company;

public class MisseleSystem extends Equipment {

    private String category;
    private int power;

    public MisseleSystem(String name, String category, int countEquipment, int power) {

        super(name,countEquipment);
        this.category=category;
    }

    public void display(){

    }

    public String getCategory(){ return category; }
    public int getPower(){return power;}

    public void setPower(int power) {this.power = power;}
    public void setCategory(String category) {this.category = category;}
}
