package org.example;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int shoeID;

    public static void main(String[] args) throws IOException {
        int selection = -1;
        Scanner in = new Scanner(System.in);
        Connection conn = null;
        String jdbc = "jdbc:mysql://localhost:3306/shoes";
        File file = new File("shoeID.txt");
        if (!file.exists()) {
            BufferedWriter bW = new BufferedWriter(new FileWriter(file));
            bW.write("1");
            bW.close();
        }
        Insert insert;



        try {
            conn = DriverManager.getConnection(jdbc, "root", "password2!");
            conn.setAutoCommit(false);
            System.out.println("Success");
            insert = new Insert(conn, in);

            BufferedReader bR = new BufferedReader(new FileReader(file));


            shoeID = parseInt(bR.readLine());

            bR.close();

            insert = new Insert(conn, in);


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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));


        while (selection != 5) {
            System.out.println("Hello. What would you like to do? Select an option by typing in a number.\n"
            + "0: Add new shoe\n"
            + "1: Edit a shoe\n"
            + "2: Add entry to shoe journal\n"
            + "3: Mark shoe as sold\n"
            + "4: Delete a shoe\n"
            + "5: Other options\n" //export db as XML or JSON (probably JSON..will probably do both tbh)
            + "OR type '5' to exit");
            boolean x = true;
            while(x) {
                try {
                    selection = parseInt(read.readLine());
                    x = false;
                } catch (NumberFormatException e) {
                    System.out.println("Error. Try again.");
                }
            }
            //selection = in.nextInt();
            switch (selection) {
                case 0: break;
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: System.out.println("Goodbye!"); break;
                default:
                    System.out.println("Invalid entry.");
                    break;
            }
        }









    }
}