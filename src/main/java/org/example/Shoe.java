package org.example;

public class Shoe {

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


    public Shoe(int year, int shoeID, int yearPurchased, String make, String model, String style, int size, String colorway, String primaryColor, String secondaryColor, boolean ownership, String dateSold) {
        this.year = year;
        this.shoeID = shoeID;
        this.yearPurchased = yearPurchased;
        this.make = make;
        this.model = model;
        this.style = style;
        this.size = size;
        this.colorway = colorway;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.ownership = ownership;
        this.dateSold = dateSold;

    }

    public int getYear() {
        return year;
    }
    public int getShoeID() {
        return shoeID;
    }

    public int getYearPurchased() {
        return yearPurchased;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getStyle() {
        return style;
    }

    public int getSize() {
        return size;
    }

    public String getColorway() {
        return colorway;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public boolean getOwnership() {
        return ownership;
    }

    public String getDateSold() {
        return dateSold;
    }

}
