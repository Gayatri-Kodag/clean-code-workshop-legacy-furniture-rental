package com.thoughtworks.furniturerental;

public class Furniture {
    public static final int REGULAR = 0;
    public static final int NEW_LAUNCH = 1;
    public static final int CHILDREN = 2;

    private String title;
    private int priceCode;

    public Furniture(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    public String getTitle() {
        return title;
    }

    public double amountFor(int daysRented) {
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

    public int frequentRenterPointsFor(int daysRented) {
        if ((getPriceCode() == NEW_LAUNCH)
                &&
                daysRented > 1) return 2;
        return 1;
    }
}