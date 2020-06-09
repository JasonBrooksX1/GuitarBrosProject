package com.guitarbros.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        guitarOrder();
        //exampleSerial();
    }

    public static void guitarOrder() {
        GuitarOrder kiosk = new GuitarOrder();
        kiosk.welcomeMessage();
    }
}

// public static void lesson16Examples() {
//        Lesson16 my16 = new Lesson16();
//        my16.showEnum();
//
//        my16.myFavoriteFlavor(Lesson16.IceCreamFlavors.CHOCOLATE);
//
//        Lesson16Enum d1[] = Lesson16Enum.values();
//        for (Lesson16Enum day : d1) {
//            System.out.println(day.name() + " at index " + day.ordinal() +
//                    " day number = " + day.getDayNum());
//        }// end for loop*/