package com.thoughtworks.furniturerental;

public class RegularFurniturePriceCode extends FurniturePriceCode{
    @Override
    int getPriceCode() {
        return Furniture.REGULAR;
    }
}
