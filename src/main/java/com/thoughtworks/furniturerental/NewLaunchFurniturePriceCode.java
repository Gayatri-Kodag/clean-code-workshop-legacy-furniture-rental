package com.thoughtworks.furniturerental;

public class NewLaunchFurniturePriceCode extends FurniturePriceCode{
    @Override
    int getPriceCode() {
        return Furniture.NEW_LAUNCH;
    }
}
