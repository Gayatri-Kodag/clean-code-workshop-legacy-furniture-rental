package com.thoughtworks.furniturerental;

import static com.thoughtworks.furniturerental.Furniture.*;

abstract public class FurniturePriceCode {
    abstract int getPriceCode();

    abstract double amountFor(int daysRented);

    abstract int frequentRenterPointsFor(int daysRented);
}
