package com.thoughtworks.furniturerental;

public class Furniture {
    public static final int REGULAR = 0;
    public static final int NEW_LAUNCH = 1;
    public static final int CHILDREN = 2;

    private String title;
    private FurniturePriceCode furniturePriceCode;

    public Furniture(String title, int priceCode) {
        this.title = title;
        setFurniturePriceCode(priceCode);
    }

    public int getFurniturePriceCode() {
        return furniturePriceCode.getPriceCode();
    }

    public void setFurniturePriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                furniturePriceCode = new RegularFurniturePriceCode();
                break;
            case NEW_LAUNCH:
                furniturePriceCode = new NewLaunchFurniturePriceCode();
                break;
            case CHILDREN:
                furniturePriceCode = new ChildrenFurniturePriceCode();
                break;
        }
    }

    public String getTitle() {
        return title;
    }

    public double amount(int daysRented) {
        double thisAmount = 0;
        //determine amounts for rental line
        switch (getFurniturePriceCode()) {
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

    public int frequentRenterPoints(int daysRented) {
        // add bonus for a two days new launch rental
        if ((getFurniturePriceCode() == Furniture.NEW_LAUNCH)
                &&
                daysRented > 1) return 2;
        return 1;
    }

}