package com.company;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import com.company.exeptions.AgeNotMustBeNullException;
import com.company.interfaces.IBinaryOperatorAge;
import com.company.interfaces.IFunctionAge;
import org.apache.log4j.Logger;

public class Conscripts extends Person implements IFunctionAge, IBinaryOperatorAge {

    private static final Logger LOGGER = Logger.getLogger(Conscripts.class);
    private boolean suitable;
    private String address;
    private String phone;
    private int age;
    private String id;
    public static int totalConscripts = 0;

    Conscripts() {
        totalConscripts+=1;
    }


    public Conscripts(String name, String lastname, String address ,String phone, int year_birthday, boolean suitable) {
        super(name, lastname, year_birthday);
        this.address = address;
        this.suitable = suitable;
        this.phone = phone;
        totalConscripts+=1;

    }
    public String getId() {
        return id;
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

    public void setId(String id) {
        this.id = id;
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
    @Override
    public Object years(Object yearBirthday, Object yearNow) {
        IBinaryOperatorAge<Integer> multiply = (x, y) -> {
            return y-x;
        };
        return years(yearBirthday,yearNow);
    }

    public int setAge(int age) {
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
    static public String generateId(){
        return StringUtils.upperCase(RandomStringUtils.randomAlphabetic(4)) +
                RandomStringUtils.randomNumeric(4);
    }

    public Object age(Object Age) {
        IFunctionAge<Integer, String> convert = x-> String.valueOf(x) + " old";
        return Age;
    }

    public String toString() {
        return "id: "+generateId()+" , Name: " + getName() + " , Lastname: " + getLastname() + " " + ", suitable:" + suitable + ", address :" + address + ", phone:" + phone + ", age" + Age(1990);
    }

    public void display() {
        System.out.println(toString());
    }

}



