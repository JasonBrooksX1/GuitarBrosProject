package com.guitarbros.java;

public class Guitar {

    private String foundation;
    private String roofType;
    private String guitarType;
    private int windowSize;
    private int garageDoorNumber;

    public Guitar() {
        this("Electric");
    } // end constructor

    public Guitar(String guitarType) {
        this("wood", "composite", guitarType, 30);
        System.out.println("The guitar type is " + guitarType);
    }// end constructor

    public Guitar(String guitarType, int windowSize) {
        this("concrete", "Shingle", guitarType, windowSize);
    }

    public Guitar(String foundation, String roofType, String guitarType, int windowSize) {
        this.foundation = foundation;
        this.roofType = roofType;
        this.guitarType= guitarType;
        this.windowSize = windowSize;
    }// end constructor

    /* Properties for Foundation */
    protected void setFoundation(String foundation) {
        //foundation = value;
        this.foundation = foundation;
    }// end property method setFoundation

    protected String getFoundation() {
        return foundation;
    }// end property method getFoundation

    // Properties for Roof Type
    protected void setRoofType(String value) {
        roofType = value;
    }// end property method setRoofType

    protected String getRoofType() {
        return roofType;
    }// end property method getRoofType

    /*Properties of Door Color*/
    protected void setGuitarType(String value) {
        guitarType = value;
    }// end property method setDoorColor

    protected String getGuitarType() {
        return guitarType;
    }// end property method getDoorColor

    /* Properties of Window Size*/
    protected void setWindowSize(int value) {
        windowSize = value;
    }// end property method setWindowSize

    protected int getWindowSize() {
        return windowSize;
    }// end property method getWindowSize

    /* Properties of GarageDoorNumber*/
    protected void setGarageDoorNumber(int value) {
        garageDoorNumber = value;
    }// end property method setWindowSize

    protected int getGarageDoorNumber() {
        return garageDoorNumber;
    }// end property method getWindowSize

}

