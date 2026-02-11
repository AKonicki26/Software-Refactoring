package main.price;

import main.Movie;

public class ChildrensPrice extends Price {

    @Override
    public double getCharge(int daysRented) {
        double price = 1.5;
        if (daysRented > 3)
            price += (daysRented - 3) * 1.5;
        return price;
    }
}
