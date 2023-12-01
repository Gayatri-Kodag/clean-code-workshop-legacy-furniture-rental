package com.thoughtworks.furniturerental;

public class NewLaunchFurniturePriceCode extends FurniturePriceCode{
    @Override
    int getPriceCode() {
        return Furniture.NEW_LAUNCH;
    }

    @Override
    double amountFor(int daysRented) {
        return daysRented * 300;
    }
}
