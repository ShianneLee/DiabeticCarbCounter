package com.shianne.java.diabeticcarbcounter;

import java.util.Date;

public class DateInfo {
    private Date dateCreated;
    private String mealType;


    public DateInfo(Date dateCreated, String mealType) {
        this.dateCreated = dateCreated;
        this.mealType = mealType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    enum MealType{
        BREAKFAST,
        LUNCH,
        DINNER,
        SNACK
    }
}
