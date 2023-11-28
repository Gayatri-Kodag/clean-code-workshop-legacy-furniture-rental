package com.thoughtworks.furniturerental;

public class Furniture {
    public static final int REGULAR = 0;
    public static final int NEW_LAUNCH = 1;
    public static final int CHILDREN = 2;

    public static final int LUXURY = 3;

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
            case LUXURY:
                furniturePriceCode = new LuxuryFurniturePriceCode();
                break;
        }
    }

    public String getTitle() {
        return title;
    }

    public double amount(int daysRented) {
       return furniturePriceCode.amount(daysRented);
    }

    public int frequentRenterPoints(int daysRented) {
       return furniturePriceCode.frequentRenterPoints(daysRented);
    }

}