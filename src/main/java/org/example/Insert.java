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
        int year, shoeID, yearPurchased, size;
        String make, model, style, colorway, primaryColor, secondaryColor, dateSold;

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




    }



}
