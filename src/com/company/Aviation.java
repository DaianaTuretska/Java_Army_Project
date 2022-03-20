package com.company;

public class Aviation extends Equipment {

    private String category;
    private int power;

    public Aviation(String name, String category, int countEquipment, int power) {

        super(name,countEquipment);
        this.category=category;
    }

    public void display(){
    }

    public String getCategory(){ return category; }
    public int getPower(){return power;}

    public void setCategory(String category) {this.category = category;}
    public void setPower(int power) {this.power = power;}
}
