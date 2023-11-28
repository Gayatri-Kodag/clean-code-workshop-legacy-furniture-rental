package com.thoughtworks.furniturerental;

abstract public class FurniturePriceCode {
    abstract int getPriceCode();

    abstract double amount(int daysRented);

    abstract int frequentRenterPoints(int daysRented);
}
