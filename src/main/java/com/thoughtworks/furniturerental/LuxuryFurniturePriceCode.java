package com.thoughtworks.furniturerental;

public class LuxuryFurniturePriceCode extends FurniturePriceCode {
    @Override
    int getPriceCode() {
        return Furniture.LUXURY;
    }

    @Override
    double amountFor(int daysRented) {
        return daysRented * 400;
    }

    @Override
    int frequentRenterPointsFor(int daysRented) {
        return 3;
    }
}
