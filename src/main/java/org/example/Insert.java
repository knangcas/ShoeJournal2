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

        System.out.println("");


    }



}
