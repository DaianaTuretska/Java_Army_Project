package com.company;

public abstract class Person {

    private String name;
    private String lastname;
    private int year_birthday;

    Person() {
    }

    public Person(String name, String lastname, int year_birthday) {
        this.name = name;
        this.lastname = lastname;
        this.year_birthday = year_birthday;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return year_birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setYear_birthday(String year_birthday) {
        this.name = year_birthday;
    }

    abstract int Age(int year_birthday);

    public String toString() {
        return name + " " + lastname + " " + year_birthday;
    }

    public abstract void display();
}

