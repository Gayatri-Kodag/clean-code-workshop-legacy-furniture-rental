package com.thoughtworks.furniturerental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {
    public double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : this) {
            totalAmount += rental.amount();
        }
        return totalAmount;
    }
}
