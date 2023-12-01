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
            double thisAmount = amountFor(rental);
            frequentRenterPoints += frequentRenterPointsFor(rental);

            //show figures for this rental
            result += "\t" + rental.getFurniture().getTitle() + "\t" +
                    thisAmount + "\n";
            totalAmount += thisAmount;
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

    private static double amountFor(Rental rental) {
        double amount = 0;
        switch (rental.getFurniture().getPriceCode()) {
            case Furniture.REGULAR:
                amount += 200;
                if (rental.getDaysRented() > 2)
                    amount += (rental.getDaysRented() - 2) * 150;
                break;
            case Furniture.NEW_LAUNCH:
                amount += rental.getDaysRented() * 300;
                break;
            case Furniture.CHILDREN:
                amount += 150;
                if (rental.getDaysRented() > 3)
                    amount += (rental.getDaysRented() - 3) * 150;
                break;
        }
        return amount;
    }
}
