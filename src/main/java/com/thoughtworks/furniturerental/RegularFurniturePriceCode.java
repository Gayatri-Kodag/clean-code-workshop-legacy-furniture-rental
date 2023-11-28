package com.thoughtworks.furniturerental;

public class RegularFurniturePriceCode extends FurniturePriceCode{
    @Override
    int getPriceCode() {
        return Furniture.REGULAR;
    }

    @Override
    double amount(int daysRented) {
        double amount = 0;
        amount += 200;
        if (daysRented > 2)
            amount += (daysRented - 2) * 150;
        return amount;
    }
}
