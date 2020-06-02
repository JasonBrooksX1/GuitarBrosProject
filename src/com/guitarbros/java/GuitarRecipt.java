package com.guitarbros.java;

import java.util.ArrayList;
import java.util.List;

class DisplayReceipt {

    ArrayList<Guitar> cartList;

    public DisplayReceipt(List<Guitar> houseList) {
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
        String description = String.format("%15s", "DESCRIPTION");
        String colorDoor = String.format("%25s", "Guitar Type");
        String foundation = String.format("%15s", "Guitar Name");
        String sizeWindow = String.format("%15s", "Model#");
        String typeRoof = String.format("%15s","UPC");
        System.out.println();
        System.out.print(quantity);
        System.out.print(description);
        System.out.print(colorDoor);
        System.out.print(foundation);
        System.out.print(sizeWindow);
        System.out.println(typeRoof);
        showStarBorder();
        showList();
    }

    private void showList() {
        String houseDesc = "This Ranch style house";
        String houseDesc2 = "is 3 Bedrooms 2 Bathrooms";
        String houseDesc3 = "and a 2 car garage";
        for(Guitar cart : cartList) {
            String quantity = String.format("%2s", "1");
            String desc = String.format("%28s", houseDesc);
            String desc2 = String.format("%33s", houseDesc2);
            String desc3 = String.format("%26s", houseDesc3);
            String colorDoor = String.format("%10s", cart.getGuitarType());
            String foundation = String.format("%15s", cart.getThingType());
            String sizeWindow = String.format("%12s inches", cart.getorderSize());
            System.out.println();
            System.out.print(quantity);
            System.out.print(desc);
            System.out.print(colorDoor);
            System.out.print(foundation);
            System.out.print(sizeWindow);
            System.out.println(desc2);
            System.out.println(desc3);
        }

        showStarBorder();
    }

    private void showStarBorder() {
        for(int i = 0; i < 95; i++) {
            System.out.print("*");
        }
    }

}
