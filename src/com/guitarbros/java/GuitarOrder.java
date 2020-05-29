package com.guitarbros.java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


class GuitarOrder {
    private List<Guitar> myOrder;
    private int orderSize, varType;
    private Scanner in;
    private String instrumentType;
    private String thingType;
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
        varChoice();
        varChoice1();
        shipSize();
        myOrder.add(new Guitar(instrumentType,thingType,orderSize));
        orderDone();
    }

    private void printResult() {
        System.out.println("THANK YOU");
        for (Guitar myGuitar : myOrder) {
            System.out.println("Your guitar order has the following: ");
            System.out.println(myGuitar.getorderSize() +" guitars ");
            //NEED A PLURALIZATION SYSTEM IN CASE MORE THAN 1 IS CHOSEN! "guitar or guitar's
            System.out.println(myGuitar.getGuitarType() + "");
            System.out.println(myGuitar.getThingType() + "");
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

    private void varChoice() {
        System.out.println("What guitar type would you prefer?");
        System.out.println("Press 1 for Electric, 2 for Acoustic or 3 for Hybrid");
        if(!verifyNumberInput()) {
            System.out.println("You have entered an incorrect value. Please try again");
            varChoice();
        } else {
            if(varType > 3) {
                System.out.println("You have entered a number larger than 3. Please try again");
                varChoice();
            } else {
                switch (varType) {
                    case 1:
                        instrumentType = "Electric";
                        break;
                    case 2:
                        instrumentType = "Acoustic";
                        break;
                    default:
                        instrumentType = "Hybrid";
                        break;
                }
            }
        }
    }

    /*===================================================================================================
    !!! NEED "IF" STATEMENTS SOMEPLACE!!!
    SHOULD A CHOICE OF ELECTRIC, ACOUSTIC, OR HYBRID IS MADE,
    AN IF STATEMENT CAN DIRECT TO THE NEXT CHOICE SELECTION UNDER EACH CATEGORY!!

    IF CHOICE IS: 1 Electric = Fender Stratocaster, Gibson Les Paul, Gibson Flying V.
    IF CHOICE IS: 2 Acoustic = Dreadnought, Parlour Auditorium.
    IF CHOICE IS: 3 Hybrid


TRY THIS! --->> public class Lesson8 {
    //This method goes over the basic if
    public void basicIfStatement(int value1, int value2) {
        System.out.println("Before if Statement");
        if (value1 == value2) {
            System.out.println("Values are equal");
        }// end if
        System.out.println("After if Statement");
    }// end method basicIfStatement

    ===================================================================================================*/
    private void varChoice1() {
        System.out.println("What style would you prefer?");
        System.out.println("Press 1 for Groovy Guitar, 2 for Rockin Guitar or 3 for Tenacious D Guitar");
        if(!verifyNumberInput()) {
            System.out.println("You have entered an incorrect value. Please try again");
            varChoice1();
        } else {
            if(varType > 3) {
                System.out.println("You have entered a number larger than 3. Please try again");
                varChoice1();
            } else {
                switch (varType) {
                    case 1:
                        thingType = "Groovy Guitar";
                        break;
                    case 2:
                        thingType = "Rockin Guitar";
                        break;
                    default:
                        thingType = "Tenacious D Guitar";
                        break;
                }
            }
        }
    }

    private void shipSize() {
        System.out.println("How many guitars would you like?");
        in = new Scanner(System.in);
        isValueRight = false;
        try {
            orderSize = in.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("You have entered an incorrect value. Please try again");
            shipSize();
        }
    }

    private boolean verifyNumberInput() {
        in = new Scanner(System.in);
        try {
            varType = in.nextInt();
            isValueRight = true;
        } catch (InputMismatchException ex) {
            isValueRight = false;
        }
        return isValueRight;
    }

}
