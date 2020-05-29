package com.guitarbros.java;

public class Guitar {
    private String guitarType;
    private int guitarCount;


    public Guitar(String guitarType, int guitarCount) {

        this.guitarType= guitarType;
        this.guitarCount = guitarCount;
    }// end constructor*/


    protected void setGuitarType(String value) {
        guitarType = value;
    }

    protected String getGuitarType() {
        return guitarType;
    }

    protected void setWindowSize(int value) {
        guitarCount = value;
    }
    protected int getWindowSize() {
        return guitarCount;
    }


}

