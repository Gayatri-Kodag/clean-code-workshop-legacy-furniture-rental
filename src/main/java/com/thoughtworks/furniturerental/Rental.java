package com.thoughtworks.furniturerental;

public class Rental {

    private int daysRented;
    private Furniture furniture;

    public Rental(Furniture furniture, int daysRented) {
        this.furniture = furniture;
        this.daysRented = daysRented;
    }

    public double amount() {
        double thisAmount = 0;
        //determine amounts for rental line
        switch (furniture.getPriceCode()) {
            case Furniture.REGULAR:
                thisAmount += 200;
                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 150;
                break;
            case Furniture.NEW_LAUNCH:
                thisAmount += daysRented * 300;
                break;
            case Furniture.CHILDREN:
                thisAmount += 150;
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 150;
                break;
        }
        return thisAmount;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Furniture getFurniture() {
        return furniture;
    }
}