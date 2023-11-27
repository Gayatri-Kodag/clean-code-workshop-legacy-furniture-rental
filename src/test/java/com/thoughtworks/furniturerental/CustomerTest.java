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
        // Arrange
        Customer customer = new Customer("John Doe");
        Rental chairRental = new Rental(new Furniture("Chair", 0), 0);
        Rental tableRental = new Rental(new Furniture("Table", 1), 0);
        customer.addRental(chairRental);
        customer.addRental(tableRental);
        String expectedStatement = "Rental Record for John Doe\n" +
                "\tChair\t200.0\n" +
                "\tTable\t0.0\n" +
                "Amount owed is 200.0\n" +
                "You earned 2 frequent renter points";

        // Act
        String actualStatement = customer.statement();

        // Assert
        assertEquals(expectedStatement, actualStatement);
    }
}