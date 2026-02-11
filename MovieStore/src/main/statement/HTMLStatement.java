package main.statement;

import main.Customer;
import main.Rental;

public class HTMLStatement extends Statement
{
    public HTMLStatement(Customer customer) {
        super(customer);
    }

    @Override
    public String getHeaderString() {
        return "<h1>Rental Record for " + customer.getName() + "</h1>\n";
    }

    @Override
    public String getRentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getPrice()) + "<br>\n";
    }

    @Override
    public String getFooterString() {
        return "<p>Amount owed is " + String.valueOf(customer.getTotalCharge()) + "</p>\n" +
                "<p>You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points</p>";    }
}
