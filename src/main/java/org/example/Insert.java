package org.example;

import java.sql.Connection;
import java.util.Scanner;

public class Insert {

    Scanner s;
    Connection c;

    public Insert(Connection c, Scanner s) {
        this.s = s;
        this.c = c;
    }

    public void insertShoe() {
        ShoeBuilder shoeBuilder = new ShoeBuilder();
        int year, shoeID, yearPurchased, size, style, primaryColor, secondaryColor;
        String make, model, colorway, dateSold;

        System.out.println("What is the shoe brand?");

        make = s.next();

        System.out.println("What is the shoe model?");

        model = s.next();

        System.out.println("What year did the shoe release?");

        while (!s.hasNextInt()) {
            System.out.println("Please type in a year. Format example: 2020");
            s.next();
        }
        year = s.nextInt();

        System.out.println("What year did you purchase this shoe?");

        while (!s.hasNextInt()){
            System.out.println("Please type in a year. Format example: 2020");
            s.next();
        }
        yearPurchased = s.nextInt();

        style = -1;

        while (style <0 || style >3) {


            System.out.println("What is the style? Enter a number.\n"
                    + "0. Casual.\n"
                    + "1. Basketball.\n"
                    + "2. Running.\n"
                    + "3. Other.");

            while (!s.hasNextInt()) {
                System.out.println("Please type a number.");
                s.next();
            }

            style = s.nextInt();

            switch (style) {
                case 0: break;
                case 1: break;
                case 2: break;
                case 3: break;
                default:
                    System.out.println("Invalid entry. Try again."); break;
            }

        }

        System.out.println("What is the shoe size (US)?");

        while(!s.hasNextInt()) {
            System.out.println("Please type a number.");
            s.next();
        }

        size = s.nextInt();

        System.out.println("What is the name of the colorway?");

        colorway = s.next();

        primaryColor = -1;

        while(primaryColor <0 || primaryColor > 12) {

            System.out.println("What is the primary color?");
            System.out.println(
                    "0. Black\n"
                            + "1. White\n"
                            + "2. Grey\n"
                            + "3. Red\n"
                            + "4. Green\n"
                            + "5. Blue\n"
                            + "6. Yellow\n"
                            + "7. Brown\n"
                            + "8. Orange\n"
                            + "9. Purple\n"
                            + "10. Gold\n"
                            + "11. Silver\n"
                            + "12. Multi-Color"
            );

            while (!s.hasNextInt()) {
                System.out.println("Please type a number.");
                s.next();
            }

            primaryColor = s.nextInt();
            switch (primaryColor) {
                case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> {
                }
                default -> System.out.println("Invalid entry.");
            }

        }

        secondaryColor = -1;

        while(secondaryColor <0 || secondaryColor > 12) {

            System.out.println("What is the secondary color?");
            System.out.println(
                    "0. Black\n"
                            + "1. White\n"
                            + "2. Grey\n"
                            + "3. Red\n"
                            + "4. Green\n"
                            + "5. Blue\n"
                            + "6. Yellow\n"
                            + "7. Brown\n"
                            + "8. Orange\n"
                            + "9. Purple\n"
                            + "10. Gold\n"
                            + "11. Silver\n"
                            + "12. Multi-Color"
            );

            while (!s.hasNextInt()) {
                System.out.println("Please type a number.");
                s.next();
            }

            secondaryColor = s.nextInt();
            switch (secondaryColor) {
                case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> {
                }
                default -> System.out.println("Invalid entry.");
            }

        }



        System.out.println("Do you currently own this shoe?"
                + "Type 1 for YES, type 2 for NO.");

        while(!s.hasNextInt()) {
            System.out.println("Please type a number.");
            s.next();
        }

        size = s.nextInt();

        //Shoe shoeToInsert = shoeBuilder.setYear(year).setColorway(colorway);



    }



}
