package com.thoughtworks.furniturerental;

public class RegularFurniturePriceCode extends FurniturePriceCode{
    @Override
    int getPriceCode() {
        return Furniture.REGULAR;
    }

    @Override
    double amountFor(int daysRented) {
        double amount = 0;
        amount += 200;
        if (daysRented > 2)
            amount += (daysRented - 2) * 150;
        return amount;
    }

    @Override
    int frequentRenterPointsFor(int daysRented) {
        return 1;
    }
}
