package com.company;

public abstract class Person {

    private String name;
    private String lastname;
    private int age;

    public Person(String name,String lastname, int age){
        this.name=name;
        this.lastname=lastname;
        this.age=age;
    }
    public String getName() { return name; }

    public String getLastname() { return lastname; }

    public int getAge() { return age; }

    public void setName(String name) {this.name = name;}

    public void setLastname(String lastname) {this.lastname = lastname;}

    public void setAge(String age) {this.name = age;}

    public abstract void display();

    public String toString(){
        return name+" "+lastname+" "+age;
    }
}

