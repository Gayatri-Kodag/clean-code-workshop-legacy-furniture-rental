package com.thoughtworks.furniturerental;

import static com.thoughtworks.furniturerental.Furniture.*;

abstract public class FurniturePriceCode {
    abstract int getPriceCode();

    double amountFor(int daysRented) {
        double amount = 0;
        switch (getPriceCode()) {
            case REGULAR:
                amount += 200;
                if (daysRented > 2)
                    amount += (daysRented - 2) * 150;
                break;
            case NEW_LAUNCH:
                amount += daysRented * 300;
                break;
            case CHILDREN:
                amount += 150;
                if (daysRented > 3)
                    amount += (daysRented - 3) * 150;
                break;
        }
        return amount;
    }
}
