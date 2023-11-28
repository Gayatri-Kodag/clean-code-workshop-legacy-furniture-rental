package com.thoughtworks.furniturerental;

public class NewLaunchFurniturePriceCode extends FurniturePriceCode{
    @Override
    int getPriceCode() {
        return Furniture.NEW_LAUNCH;
    }

    @Override
    double amount(int daysRented) {
        double amount = 0;
        amount += daysRented * 300;
        return amount;
    }

    @Override
    int frequentRenterPoints(int daysRented) {
        if (daysRented > 1) return 2;
        return 1;
    }
}
