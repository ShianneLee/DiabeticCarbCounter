package com.shianne.java.diabeticcarbcounter;

public class Insulin {
    private int unit;
    private String type;

    public Insulin(int unit, String type) {
        this.unit = unit;
        this.type = type;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    enum InsulinType{
        CORRECTION_INS,
        TOTAL_INS,
        GROSS_INS,
        IN_BODY_INS
    }
}
