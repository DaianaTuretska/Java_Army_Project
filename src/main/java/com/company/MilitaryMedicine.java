package com.company;
import com.company.enums.MedicineEquipment;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class MilitaryMedicine extends Army {

    private int battalions;
    private String categories;
    private String rank;
    List<MedicineEquipment> equipment;

    MilitaryMedicine() {
    }

    public MilitaryMedicine(String name, String rank, int countPerson, int battalions,  List<MedicineEquipment> equipment, String categories) {
        super(name, countPerson);
        this.rank = rank;
        this.battalions = battalions;
        this.equipment = equipment;
        this.categories = categories;
    }

    public String getRank() {
        return rank;
    }

    public int getBattalions() {
        return battalions;
    }

    public List<MedicineEquipment> getEquipment() {
        return equipment;
    }

    public String getCategories() {
        return categories;
    }

    public void setBattalions(int battalions) {
        this.battalions = battalions;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setEquipment(List<MedicineEquipment> equipment) {
        this.equipment = equipment;
    }
    public String getEquipmentString() {
        return equipment.stream()
                .map(item -> item + "(" + item.getValue() + ")")
                .collect(Collectors.joining(","));
    }
    public String toString() {
        return "name:" + getName() + " count person:" + getCountPerson() + "rank:" + rank + " equipment:" + equipment + " battalions:" + battalions;
    }

    public void display() {
    }
}

