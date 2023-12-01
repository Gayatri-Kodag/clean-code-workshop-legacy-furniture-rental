package com.thoughtworks.furniturerental;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void test() {

        int expected = 3;

        assertEquals(expected, 1 + 2);
    }

    @Test
    void shouldGenerateStatement() {
        Customer customer = new Customer("John Doe");
        Rental chairRental = new Rental(new Furniture("Chair", 0), 2);
        Rental tableRental = new Rental(new Furniture("Table", 1), 3);
        Rental wardrobeRental = new Rental(new Furniture("Wardrobe", 2), 6);
        customer.addRental(chairRental);
        customer.addRental(tableRental);
        customer.addRental(wardrobeRental);
        String expectedStatement="Rental Record for John Doe\n"+
                "\tChair\t200.0\n"+
                "\tTable\t900.0\n"+
                "\tWardrobe\t600.0\n"+
                "Amount owed is 1700.0\n"+
                "You earned 4 frequent renter points";

        String actualStatement = customer.statement();


        assertEquals(expectedStatement, actualStatement);

    }

    @Test
    void shouldGenerateHTMLStatement() {
        Customer customer = new Customer("John Doe");
        Rental chairRental = new Rental(new Furniture("Chair", 0), 2);
        Rental tableRental = new Rental(new Furniture("Table", 1), 3);
        Rental wardrobeRental = new Rental(new Furniture("Wardrobe", 2), 6);
        customer.addRental(chairRental);
        customer.addRental(tableRental);
        customer.addRental(wardrobeRental);
        String expectedStatement="<h1>Rental Record for <b>John Doe</b></h1>\n"+
                "\tChair\t200.0\n"+
                "\tTable\t900.0\n"+
                "\tWardrobe\t600.0\n"+
                "Amount owed is <b>1700.0</b>\n"+
                "You earned <b>4</b> frequent renter points";

        String actualStatement = customer.htmlStatement();


        assertEquals(expectedStatement, actualStatement);
    }
}