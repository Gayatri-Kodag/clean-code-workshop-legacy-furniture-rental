package com.thoughtworks.furniturerental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental : rentals) {
            frequentRenterPoints += frequentRenterPointsFor(rental);

            //show figures for this rental
            result += "\t" + rental.getFurniture().getTitle() + "\t" +
                    rental.amount() + "\n";
            totalAmount += rental.amount();
        }

        //add footer lines result
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints
                + " frequent renter points";
        return result;
    }

    private static int frequentRenterPointsFor(Rental rental) {
        // add bonus for a two days new launch rental
        if ((rental.getFurniture().getPriceCode() == Furniture.NEW_LAUNCH)
                &&
                rental.getDaysRented() > 1) return 2;
        return 1;
    }

}
