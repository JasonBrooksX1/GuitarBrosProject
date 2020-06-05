package com.guitarbros.java;

public abstract class FenderStratocaster implements electricType1 {

    private int cost;
    private String name;
    private String type;
    private int model;
    private int upc;


    public FenderStratocaster(int cost, String name, String type, int model, int upc) {
        this.cost = cost;
        this.name = name;
        this.type = type;
        this.model = model;
        this.upc = upc;


    }// end constructor


    protected void setCost(String value) {
        this.cost = 700;
    }

    protected int getCost() {

        return cost;
    }//price

    protected void setName(String name) {

        this.name = "FenderStratocaster";
    }

    protected String getName() {

        return name;
    }//name

    protected void setType(String type) {

        this.type = "Electric";
    }

    protected String getType() {

        return type;
    }//type

    protected void setModel(String value) {

        this.model = 6400;
    }

    protected int getModel() {

        return model;
    }//model

    protected void setUpc(String value) {

        this.model = 1132438488;
    }

    protected int getUpc() {

        return upc;
    }//upc
}