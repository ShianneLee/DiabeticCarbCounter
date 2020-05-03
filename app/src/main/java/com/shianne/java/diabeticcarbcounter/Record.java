package com.shianne.java.diabeticcarbcounter;

public class Record {
    private int recordId;
    /*private int grossCarbs;
    private int fibre;*/
    private Nutrient netCarbs;
    private Insulin grossInsulin;
    private Insulin correctionInsulin;
    private Insulin inBodyInsulin;
    private int totalUnits;
    private DateInfo dateInfo;

    public Record(int id, Nutrient nCarbs, Insulin gInsulin, Insulin cInsulin, Insulin bodyInsulin, int totUnits, DateInfo dateInformation){
        recordId = id;
        /*grossCarbs = gCarbs;
        fibre = fib;*/
        netCarbs = nCarbs;
        grossInsulin = gInsulin;
        correctionInsulin = cInsulin;
        inBodyInsulin = bodyInsulin;
        totalUnits = totUnits;
        dateInfo = dateInformation;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }
/*

    public int getGrossCarbs() {
        return grossCarbs;
    }

    public void setGrossCarbs(int grossCarbs) {
        this.grossCarbs = grossCarbs;
    }

    public int getFibre() {
        return fibre;
    }

    public void setFibre(int fibre) {
        this.fibre = fibre;
    }
*/
    public Nutrient getNetCarbs() {
        return netCarbs;
    }

    public void setNetCarbs(Nutrient netCarbs) {
        this.netCarbs = netCarbs;
    }


    public Insulin getGrossInsulin() {
        return grossInsulin;
    }

    public void setGrossInsulin(Insulin grossInsulin) {
        this.grossInsulin = grossInsulin;
    }

    public Insulin getCorrectionInsulin() {
        return correctionInsulin;
    }

    public void setCorrectionInsulin(Insulin correctionInsulin) {
        this.correctionInsulin = correctionInsulin;
    }

    public Insulin getInBodyInsulin() {
        return inBodyInsulin;
    }

    public void setInBodyInsulin(Insulin inBodyInsulin) {
        this.inBodyInsulin = inBodyInsulin;
    }

    public int getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(int totalUnits) {
        this.totalUnits = totalUnits;
    }

    public DateInfo getDateInfo() {
        return dateInfo;
    }

    public void setDateInfo(DateInfo dateInfo) {
        this.dateInfo = dateInfo;
    }
}
