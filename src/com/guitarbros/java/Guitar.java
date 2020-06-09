package com.guitarbros.java;

public class Guitar {

    private String guitarType;
    private int guitarCount;
    private String thingType;
    private String thingColor1;


    public Guitar(String guitarType, String thingType, int guitarCount, String thingColor1) {

        this.guitarType = guitarType;
        this.guitarCount = guitarCount;
        this.thingType = thingType;
        this.thingColor1 = thingColor1;
    }// end constructor*/


    protected void setGuitarType(String value) {
        guitarType = value;
    }

    protected String getGuitarType() {
        return guitarType;
    }

    protected void setThingType(String value) {
        thingType = value;
    }

    protected String getThingType() {
        return thingType;
    }


    protected void setOrderSize(int value) {
        guitarCount = value;
    }
    protected int getOrderSize() {
        return guitarCount;
    }

    protected void setThingColor1(String value) {
        thingColor1 = value;
    }

    protected String getThingColor1() {
        return thingColor1;
    }

}