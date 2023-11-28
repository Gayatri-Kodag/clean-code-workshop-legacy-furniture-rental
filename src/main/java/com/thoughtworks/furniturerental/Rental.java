package com.thoughtworks.furniturerental;

public class Rental {

    private int daysRented;
    private Furniture furniture;

    public Rental(Furniture furniture, int daysRented) {
        this.furniture = furniture;
        this.daysRented = daysRented;
    }

    public double amount() {
        return getFurniture().amount(daysRented);
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public int frequentRenterPoints() {
        // add bonus for a two days new launch rental
        if ((getFurniture().getPriceCode() == Furniture.NEW_LAUNCH)
                &&
                getDaysRented() > 1) return 2;
        return 1;
    }
}