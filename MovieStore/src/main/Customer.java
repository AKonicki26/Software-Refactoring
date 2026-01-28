package main;

import java.util.* ;

public class Customer {

    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
       _name = name;
    }

    public void addRental(Rental arg) {
       _rentals.addElement(arg);
    }

    public String getName() {
       return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "main.Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            thisAmount += getRentalPrice(each);

            // add frequent renter points
            frequentRenterPoints ++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && 
               each.getDaysRented() > 1) frequentRenterPoints ++;

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" + 
               String.valueOf(thisAmount) + "\n";

            totalAmount += thisAmount;

        }
        //add footer lines
        result +=  "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + 
                    " frequent renter points";
        return result;

    }

    private double getRentalPrice(Rental rental) {
        double price = 0;

        //determine amounts for each line
        switch (rental.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                price += 2;
                if (rental.getDaysRented() > 2)
                    price += (rental.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                price += rental.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                price += 1.5;
                if (rental.getDaysRented() > 3)
                    price += (rental.getDaysRented() - 3) * 1.5;
                break;

        }

        return price;
    }
}


