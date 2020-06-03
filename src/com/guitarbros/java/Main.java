package com.guitarbros.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GuitarOrder();
    }

    public static void GuitarOrder() {
        GuitarOrder kiosk = new GuitarOrder();
        kiosk.welcomeMessage();
        testPrintOut();


    }

    static void testPrintOut() {
        // create your own custom list
        // pass the list to the receipt to test the receipt only.
        List<Guitar> myGuitar = new ArrayList<>();
        GuitarReceipt receipt = new GuitarReceipt(myGuitar);

    }
}
