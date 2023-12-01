package com.thoughtworks.furniturerental;

import static com.thoughtworks.furniturerental.Furniture.NEW_LAUNCH;

public class NewLaunchFurniturePriceCode extends FurniturePriceCode{
    @Override
    int getPriceCode() {
        return Furniture.NEW_LAUNCH;
    }

    @Override
    double amountFor(int daysRented) {
        return daysRented * 300;
    }

    @Override
    int frequentRenterPointsFor(int daysRented) {
        return 2;
    }
}
