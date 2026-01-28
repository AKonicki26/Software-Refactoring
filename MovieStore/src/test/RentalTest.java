package test;


import main.Customer;
import main.Movie;
import main.Rental;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {
    @Test
    public void RentalTestBob_Successful() {
        Customer bob = new Customer("Bob");

        var dumbo = new Movie("Dumbo", 2);
        var jaws = new Movie("Jaws", 0);

        var dumboRental = new Rental(dumbo,2);
        var jawsRental = new Rental(jaws, 5);

        bob.addRental(dumboRental);
        bob.addRental(jawsRental);

        var bobOutput = """
                main.Rental Record for Bob
                \tDumbo\t1.5
                \tJaws\t6.5
                Amount owed is 8.0
                You earned 2 frequent renter points""";

        assertEquals(bob.statement(), bobOutput);
    }

    @Test
    public void RentalTestAnn_Successful() {
        Customer bob = new Customer("Ann");

        var ghost = new Movie("Ghost", 1);

        var ghostRental1 = new Rental(ghost,1);
        var ghostRental2 = new Rental(ghost, 3);

        bob.addRental(ghostRental1);
        bob.addRental(ghostRental2);

        var bobOutput = """
        main.Rental Record for Ann
        \tGhost\t3.0
        \tGhost\t9.0
        Amount owed is 12.0
        You earned 3 frequent renter points""";


        assertEquals(bob.statement(), bobOutput);
    }
}
