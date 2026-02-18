// Astrid Konicki
package main.statement;

import main.Customer;
import main.Rental;

public class TextStatement extends Statement {
    public TextStatement(Customer customer) {
        super(customer);
    }

    @Override
    public String getHeaderString() {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    public String getRentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getPrice()) + "\n";
    }

    @Override
    public String getFooterString() {
        return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n" +
                "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }
}
