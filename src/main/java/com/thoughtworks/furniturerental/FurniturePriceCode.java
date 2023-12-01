package com.thoughtworks.furniturerental;

import static com.thoughtworks.furniturerental.Furniture.*;

abstract public class FurniturePriceCode {
    abstract int getPriceCode();

    abstract double amountFor(int daysRented);

    int frequentRenterPointsFor(int daysRented) {
        if ((getPriceCode() == NEW_LAUNCH)
                &&
                daysRented > 1) return 2;
        return 1;
    }
}
