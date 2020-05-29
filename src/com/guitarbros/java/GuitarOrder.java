package com.guitarbros.java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


class GuitarOrder {
    private List<Guitar> myOrder;
    private int orderSize, colorNum;
    private Scanner in;
    private String guitarType;
    private boolean isValueRight;

    public GuitarOrder() {
        myOrder = new ArrayList<>();

    }

    public void welcomeMessage() {
        System.out.println("Welcome to Guitar Bros.");
        System.out.println("We specialize in Guitars");
        buildHouse();
    }

    private void buildHouse() {
        System.out.println("Your dream guitar is waiting");
        windowSize();
        doorColor();
        myOrder.add(new Guitar(guitarType, orderSize));
        orderDone();
    }

    private void printResult() {
        System.out.println("Your guitars are listed below");
        for (Guitar myHouse : myOrder) {
            System.out.println("Your guitar order has the following: ");
            System.out.println(myHouse.getWindowSize() +" guitars");
            System.out.println(myHouse.getGuitarType() + "");
            System.out.println();
        }
    }

    private void orderDone() {
        System.out.println("Does this complete your order? Y for yes, N for no");
        String val = in.next();
        switch (val) {
            case "Y":
            case "y":
                printResult();
                break;
            case "N":
            case "n":
                buildHouse();
                break;
            default:
                System.out.println("You have entered an incorrect value. Please try again");
                orderDone();
                break;
        }

    }

    private void doorColor() {
        System.out.println("What guitar type would you prefer?");
        System.out.println("Press 1 for Electric, 2 for Acoustic or 3 for Hybrid");
        if(!verifyNumberInput()) {
            System.out.println("You have entered an incorrect value. Please try again");
            doorColor();
        } else {
            if(colorNum > 3) {
                System.out.println("You have entered a number larger than 3. Please try again");
                doorColor();
            } else {
                switch (colorNum) {
                    case 1:
                        guitarType = "Electric";
                        break;
                    case 2:
                        guitarType = "Acoustic";
                        break;
                    default:
                        guitarType = "Hybrid";
                        break;
                }
            }
        }
    }

    private void windowSize() {
        System.out.println("How many guitars would you like?");
        in = new Scanner(System.in);
        isValueRight = false;
        try {
            orderSize = in.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("You have entered an incorrect value. Please try again");
            windowSize();
        }
    }

    private boolean verifyNumberInput() {
        in = new Scanner(System.in);
        try {
            colorNum = in.nextInt();
            isValueRight = true;
        } catch (InputMismatchException ex) {
            isValueRight = false;
        }
        return isValueRight;
    }

}
