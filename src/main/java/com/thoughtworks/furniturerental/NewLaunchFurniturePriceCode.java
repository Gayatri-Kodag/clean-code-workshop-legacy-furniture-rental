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
}
