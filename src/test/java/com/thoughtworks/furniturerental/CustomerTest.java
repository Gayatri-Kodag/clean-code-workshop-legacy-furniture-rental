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
        Rental chairRental = new Rental(new Furniture("Chair", 0), 1);
        Rental tableRental = new Rental(new Furniture("Table", 1), 2);
        customer.addRental(chairRental);
        customer.addRental(tableRental);
        String expectedStatement = "Rental Record for John Doe\n" +
                "\tChair\t200.0\n" +
                "\tTable\t600.0\n" +
                "Amount owed is 800.0\n" +
                "You earned 3 frequent renter points";

        // Act
        String actualStatement = customer.statement();

        // Assert
        assertEquals(expectedStatement, actualStatement);
    }

    @Test
    void shouldGenerateHTMLStatement() {
        // Arrange
        Customer customer = new Customer("John Doe");
        Rental chairRental = new Rental(new Furniture("Chair", 0), 1);
        Rental tableRental = new Rental(new Furniture("Table", 1), 2);
        customer.addRental(chairRental);
        customer.addRental(tableRental);
        String expectedStatement = "<h1>Rental Record for <b>John Doe</b></h1>\n" +
                "\t<br>Chair\t200.0</br>\n" +
                "\t<br>Table\t600.0</br>\n" +
                "Amount owed is <b>800.0</b>\n" +
                "You earned <b>3</b> frequent renter points";

        // Act
        String actualStatement = customer.htmlStatement();

        // Assert
        assertEquals(expectedStatement, actualStatement);
    }

    @Test
    void shouldGenerateStatementForLuxuryFurniture() {
        // Arrange
        Customer customer = new Customer("John Doe");
        Rental chairRental = new Rental(new Furniture("Chair", 0), 1);
        Rental tableRental = new Rental(new Furniture("Table", 1), 2);
        Rental wardrobeRental = new Rental(new Furniture("Wardrobe", 2), 2);
        Rental sofaRental = new Rental(new Furniture("Sofa", 3), 5);
        customer.addRental(chairRental);
        customer.addRental(tableRental);
        customer.addRental(wardrobeRental);
        customer.addRental(sofaRental);
        String expectedStatement = "<h1>Rental Record for <b>John Doe</b></h1>\n" +
                "\t<br>Chair\t200.0</br>\n" +
                "\t<br>Table\t600.0</br>\n" +
                "\t<br>Wardrobe\t150.0</br>\n" +
                "\t<br>Sofa\t2000.0</br>\n" +
                "Amount owed is <b>2950.0</b>\n" +
                "You earned <b>7</b> frequent renter points";

        // Act
        String actualStatement = customer.htmlStatement();

        // Assert
        assertEquals(expectedStatement, actualStatement);
    }
}