package com.thoughtworks.furniturerental;

abstract public class FurniturePriceCode {
    abstract int getPriceCode();

    public double amount(int daysRented) {
        double thisAmount = 0;
        //determine amounts for rental line
        switch (getPriceCode()) {
            case Furniture.REGULAR:
                thisAmount += 200;
                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 150;
                break;
            case Furniture.NEW_LAUNCH:
                thisAmount += daysRented * 300;
                break;
            case Furniture.CHILDREN:
                thisAmount += 150;
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 150;
                break;
        }
        return thisAmount;
    }
}
