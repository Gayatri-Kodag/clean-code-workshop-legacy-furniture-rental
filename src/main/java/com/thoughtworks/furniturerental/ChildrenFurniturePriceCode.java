package com.thoughtworks.furniturerental;

public class ChildrenFurniturePriceCode extends FurniturePriceCode{
    @Override
    int getPriceCode() {
        return Furniture.CHILDREN;
    }

    @Override
    double amount(int daysRented) {
        double amount = 0;
        amount += 150;
        if (daysRented > 3)
            amount += (daysRented - 3) * 150;
        return amount;
    }

    @Override
    int frequentRenterPoints(int daysRented) {
        return 1;
    }
}
