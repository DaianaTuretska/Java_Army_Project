package com.company;

class Admiral extends Rank {
    private String subdivision;
    private String typeArmy;
    private String badge;
    private String category;

    public Admiral(String typeArmy, String name, String category, String badge, String subdivision) {

        super(name);
        this.typeArmy = typeArmy;
        this.badge = badge;
        this.subdivision = subdivision;
        this.category = category;

    }

    public String getTypeArmy() {
        return typeArmy;
    }

    public String getBadge() {
        return badge;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public String getCategory() {
        return category;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public void setTypeArmy(String typeArmy) {
        this.typeArmy = typeArmy;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return "name:" + getName() + " , typeArmy: " + typeArmy + ", subdivision:" + subdivision + ", badge:" + badge + ", category:" + category;
    }

        public void display() {

    }
}

