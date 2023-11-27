package com.thoughtworks.furniturerental;

public class Customer {
    private String name;
    private Rentals rentals = new Rentals();

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
        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental : rentals) {
            result += "\t" + rental.getFurniture().getTitle() + "\t" +
                    rental.amount() + "\n";
        }
        result += "Amount owed is " + rentals.totalAmount() + "\n";
        result += "You earned " + rentals.totalFrequentRenterPoints()
                + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        String result = "<h1>Rental Record for <b>" + getName() + "</b></h1>\n";
        for (Rental rental : rentals) {
            result += "\t<br>" + rental.getFurniture().getTitle() + "\t" +
                    rental.amount() + "</br>\n";
        }
        result += "Amount owed is <b>" + rentals.totalAmount() + "</b>\n";
        result += "You earned <b>" + rentals.totalFrequentRenterPoints()
                + "</b> frequent renter points";
        return result;
    }
}
