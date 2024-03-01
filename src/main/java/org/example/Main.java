package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static Scanner in;
    static Connection conn;
    public static void main(String[] args) {
        int selection = -1;

        Connection conn = null;
        String jdbc = "jdbc:mysql://localhost:3306/shoes";

        try {
            conn = DriverManager.getConnection(jdbc, "root", "password2!");
            conn.setAutoCommit(false);
            System.out.println("Success");

            /*
            Statement s = null;
            ResultSet rS = null;
            s = conn.createStatement();
            rS = s.executeQuery("SELECT * FROM SHOE");
            while (rS.next()) {
                System.out.printf("%-10s", rS.getInt(1));
                System.out.printf("%-10s", rS.getInt(2));
                System.out.printf("%-10s", rS.getInt(3));
                System.out.printf("%-10s", rS.getString(4));
                System.out.printf("%-10s", rS.getString(5));
                System.out.printf("%-10s", rS.getString(6));
                System.out.printf("%-10s", rS.getInt(7));
                System.out.printf("%-10s", rS.getString(8));
                System.out.printf("%-10s", rS.getString(9));
                System.out.printf("%-10s", rS.getString(10));
                System.out.printf("%-10s", rS.getBoolean(11));
                System.out.printf("%-10s", rS.getString(12));
            }
             */

        }
        catch (SQLException e) {
            System.out.println("Could not connect");
        }

        while (selection != 5) {
            System.out.println("Hello. What would you like to do? Select an option by typing in a number.\n"
            + "0: Add new shoe\n"
            + "1: Edit a shoe\n"
            + "2: Add entry to shoe journal\n"
            + "3: Mark shoe as sold\n"
            + "4: Delete a shoe\n"
            + "5: Other options\n" //export db as XML or JSON (probably JSON..will probably do both tbh)
            + "OR type '5' to exit");
            while (!in.hasNextInt()) {
                System.out.println("PLease enter an integer from 0 to 4.");
                in.next();
            }
            selection = in.nextInt();
            switch (selection) {
                case 0: break;
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                default:
                    System.out.println("Invalid entry.");
                    break;
            }
        }







    }
}