package com.thoughtworks.furniturerental;

public class Rental {

    private int daysRented;
    private Furniture furniture;

    public Rental(Furniture furniture, int daysRented) {
        this.furniture = furniture;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public double amount() {
        return furniture.amountFor(daysRented);
    }

    public int frequentRenterPoints() {
        // add bonus for a two days new launch rental
        return furniture.frequentRenterPointsFor(daysRented);
    }

}