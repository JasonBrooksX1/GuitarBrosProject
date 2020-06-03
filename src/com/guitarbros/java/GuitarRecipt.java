package com.guitarbros.java;

import java.util.ArrayList;
import java.util.List;


class GuitarReceipt {

    ArrayList<Guitar> cartList;

    public GuitarReceipt(List<Guitar> houseList) {
        cartList = (ArrayList<Guitar>) houseList;
        // start of the print receipt goes here
        showReceiptTitle();
    }

    private void showReceiptTitle() {
        showStarBorder();
        String company = String.format("%51s","Guitar Bros");
        String address = String.format("%54s", "777 Awesome Avenue");
        String cityState = String.format("%54s", "Showcase City, MO");
        System.out.println();
        System.out.println(company);
        System.out.println(address);
        System.out.println(cityState);
        showStarBorder();
        showColumns();
    }

    private void showColumns() {
        String quantity = String.format("%5s", "QTY");
        String price = String.format("%15s", "PRICE");
        String GuitarName = String.format("%25s", "Guitar Name");
        String GuitarType = String.format("%15s", "Guitar Type");
        String Model = String.format("%15s", "Model#");
        String UPC = String.format("%15s","UPC");
        System.out.println();
        System.out.print(quantity);
        System.out.print(price);
        System.out.print(GuitarName);
        System.out.print(GuitarType);
        System.out.print(Model);
        System.out.println(UPC);
        showStarBorder();
    }

    private void showStarBorder() {
        for(int i = 0; i < 92; i++) {
            System.out.print("*");
        }

    }

}
