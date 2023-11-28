package com.thoughtworks.furniturerental;

abstract public class FurniturePriceCode {
    abstract int getPriceCode();

    abstract double amount(int daysRented);

    public int frequentRenterPoints(int daysRented) {
        // add bonus for a two days new launch rental
        if ((getPriceCode() == Furniture.NEW_LAUNCH)
                &&
                daysRented > 1) return 2;
        return 1;
    }
}
