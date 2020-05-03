package com.shianne.java.diabeticcarbcounter;

public class Nutrient {
    private String type;
    private int netNutrientIntake;

    public Nutrient(String type, int netNutrientIntake) {
        this.type = type;
        this.netNutrientIntake = netNutrientIntake;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNetNutrientIntake() {
        return netNutrientIntake;
    }

    public void setNetNutrientIntake(int netNutrientIntake) {
        this.netNutrientIntake = netNutrientIntake;
    }

    enum NutrientType{
        FIBRE,
        NET_CARBS
    }
}
