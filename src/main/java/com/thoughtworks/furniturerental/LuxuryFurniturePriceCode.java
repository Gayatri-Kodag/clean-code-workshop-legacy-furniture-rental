package com.thoughtworks.furniturerental;

public class LuxuryFurniturePriceCode extends FurniturePriceCode{
    @Override
    int getPriceCode() {
        return Furniture.LUXURY;
    }

    @Override
    double amount(int daysRented) {
        return daysRented * 400;
    }

    @Override
    int frequentRenterPoints(int daysRented) {
        return 3;
    }
}
