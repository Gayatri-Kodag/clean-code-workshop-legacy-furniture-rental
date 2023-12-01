package com.thoughtworks.furniturerental;

public class ChildrenFurniturePriceCode extends FurniturePriceCode{
    @Override
    int getPriceCode() {
        return Furniture.CHILDREN;
    }
}
