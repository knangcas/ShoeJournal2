package org.example;

public class ShoeBuilder {

private int year;

private int shoeID;

private int yearPurchased;

private String make;

private String model;

private String style;

private int size;

private String colorway;

private String primaryColor;

private String secondaryColor;

private boolean ownership;

private String dateSold;


ShoeBuilder setYear(int n) {
    year = n;
    return this;
}

ShoeBuilder setID(int n) {
    shoeID = n;
    return this;
}

ShoeBuilder setYearPurchased(int n) {
    yearPurchased = n;
    return this;
}

ShoeBuilder setMake(String s) {
    make = s;
    return this;
}

ShoeBuilder setModel(String s) {
    model = s;
    return this;
}

ShoeBuilder setStyle(String s) {
    style = s;
    return this;
}

ShoeBuilder setSize(int n) {
    size = n;
    return this;
}

ShoeBuilder setColorway(String s) {
    colorway = s;
    return this;
}

ShoeBuilder setPrimaryColor(String s) {
    primaryColor = s;
    return this;
}

ShoeBuilder setSecondaryColor(String s) {
    secondaryColor = s;
    return this;
}

ShoeBuilder setOwnership(boolean b) {
    ownership = b;
    return this;
}

ShoeBuilder setDateSold(String s) {
    dateSold = s;
    return this;
}



}
