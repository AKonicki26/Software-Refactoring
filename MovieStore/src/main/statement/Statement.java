package main.statement;

import main.Customer;
import main.Rental;

public abstract class Statement {

    protected Customer customer;
    public Statement(Customer customer) {
        this.customer = customer;
    }
    public String getStatement() {
        String result = getHeaderString();

        for (Rental rental : customer.getRentals()) {
            // show figures for this rental
            result += getRentalString(rental);
        }
        // add footer lines
        result += getFooterString();
        return result;

    }

    public abstract String getHeaderString();
    public abstract String getRentalString(Rental rental);
    public abstract String getFooterString();
}
