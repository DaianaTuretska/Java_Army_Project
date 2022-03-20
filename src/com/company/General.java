package com.company;

class General extends Rank {
    private String subdivision;
    private String typeArmy;
    private String badge;
    private String category;

    public General(String typeArmy, String name, String category, String badge, String subdivision) {

        super(name);
        this.badge = badge;
        this.subdivision = subdivision;
        this.category = category;
        this.typeArmy = typeArmy;
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

    public String getTypeArmy() {
        return typeArmy;
    }

    public String toString() {
        return  "name:" + getName() + " , typeArmy: " + typeArmy +", subdivision:"+ subdivision + ", badge:" + badge +", category:"+ category;
    }

    public void display() {

    }
}

