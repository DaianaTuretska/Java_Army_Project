package com.company;

public abstract class Person {

    private String name;
    private String lastname;
    private int yearBirthday;

    Person() {
    }

    public Person(String name, String lastname, int year_birthday) {
        this.name = name;
        this.lastname = lastname;
        this.yearBirthday = year_birthday;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return yearBirthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setYearBirthday(String yearBirthday) {
        this.name = yearBirthday;
    }

    abstract int Age(int yearBirthday);

    public String toString() {
        return name + " " + lastname + " " + yearBirthday;
    }

    public abstract void display();
}

