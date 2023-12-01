package com.thoughtworks.furniturerental;

public class Rental {

    private int daysRented;
    private Furniture furniture;

    public Rental(Furniture furniture, int daysRented) {
        this.furniture = furniture;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public double amount() {
        double amount = 0;
        switch (getFurniture().getPriceCode()) {
            case Furniture.REGULAR:
                amount += 200;
                if (getDaysRented() > 2)
                    amount += (getDaysRented() - 2) * 150;
                break;
            case Furniture.NEW_LAUNCH:
                amount += getDaysRented() * 300;
                break;
            case Furniture.CHILDREN:
                amount += 150;
                if (getDaysRented() > 3)
                    amount += (getDaysRented() - 3) * 150;
                break;
        }
        return amount;
    }
}