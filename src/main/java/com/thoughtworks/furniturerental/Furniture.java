package com.thoughtworks.furniturerental;

public class Furniture {
    public static final int REGULAR = 0;
    public static final int NEW_LAUNCH = 1;
    public static final int CHILDREN = 2;

    private String title;
    private FurniturePriceCode furniturePriceCode;

    public Furniture(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return furniturePriceCode.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
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

    public double amountFor(int daysRented) {
        return furniturePriceCode.amountFor(daysRented);
    }

    public int frequentRenterPointsFor(int daysRented) {
        if ((getPriceCode() == NEW_LAUNCH)
                &&
                daysRented > 1) return 2;
        return 1;
    }
}