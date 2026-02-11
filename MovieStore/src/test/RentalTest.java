package test;


import main.Customer;
import main.Movie;
import main.Rental;
import main.price.ChildrensPrice;
import main.price.NewReleasePrice;
import main.price.RegularPrice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {
    @Test
    public void RentalTestBob_Successful() {
        Customer bob = new Customer("Bob");

        var dumbo = new Movie("Dumbo", new ChildrensPrice());
        var jaws = new Movie("Jaws", new RegularPrice() );

        var dumboRental = new Rental(dumbo,2);
        var jawsRental = new Rental(jaws, 5);

        bob.addRental(dumboRental);
        bob.addRental(jawsRental);

        var bobOutput = """
                Rental Record for Bob
                \tDumbo\t1.5
                \tJaws\t6.5
                Amount owed is 8.0
                You earned 2 frequent renter points""";

        assertEquals(bob.statement(), bobOutput);
    }

    @Test
    public void RentalTestAnn_Successful() {
        Customer bob = new Customer("Ann");

        var ghost = new Movie("Ghost", new NewReleasePrice());

        var ghostRental1 = new Rental(ghost,1);
        var ghostRental2 = new Rental(ghost, 3);

        bob.addRental(ghostRental1);
        bob.addRental(ghostRental2);

        var bobOutput = """
        Rental Record for Ann
        \tGhost\t3.0
        \tGhost\t9.0
        Amount owed is 12.0
        You earned 3 frequent renter points""";


        assertEquals(bob.statement(), bobOutput);
    }

    @Test
    public void testCustomer1_HTML_Statement() {
        Customer cust1;

        Movie mov1;
        Movie mov2;

        Rental ren1;
        Rental ren2;

        cust1 = new Customer("bob");

        mov1 = new Movie("dumbo", new ChildrensPrice());
        mov2 = new Movie("jaws", new RegularPrice());

        ren1 = new Rental(mov1, 2);
        ren2 = new Rental(mov2, 5);

        cust1.addRental(ren1);
        cust1.addRental(ren2);

        // System.out.println("\n" + cust1.statement() + "\n");
        String actual = cust1.htmlStatement();
        String expected = "<h1>Rental Record for bob</h1>\n"
                + "	dumbo	1.5<br>\n"
                + "	jaws	6.5<br>\n"
                + "<p>Amount owed is 8.0</p>\n"
                + "<p>You earned 2 frequent renter points</p>";

        assertEquals(expected, actual);

    }

    @Test
    public void testCustomer2_HTML_Statement() {

        Customer cust2;

        Movie mov3;

        Rental ren3;
        Rental ren4;

        cust2 = new Customer("ann");

        mov3 = new Movie("ghost", new NewReleasePrice());

        ren3 = new Rental(mov3, 1);
        ren4 = new Rental(mov3, 3);

        cust2.addRental(ren3);
        cust2.addRental(ren4);

        //System.out.println("\n" + cust2.statement() + "\n");

        String actual = cust2.htmlStatement();
        String expected = "<h1>Rental Record for ann</h1>\n"
                + "	ghost	3.0<br>\n"
                + "	ghost	9.0<br>\n"
                + "<p>Amount owed is 12.0</p>\n"
                + "<p>You earned 3 frequent renter points</p>";

        assertEquals(expected, actual);
    }
}
