// Astrid Konicki
package main;

import main.price.ChildrensPrice;
import main.price.NewReleasePrice;
import main.price.Price;
import main.price.RegularPrice;

public class Movie {


    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private final String _title;

    private Price _price;

    @Deprecated
    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public Movie(String title, Price price) {
        _title = title;
        setPriceCode(price);
    }

    @Deprecated
    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            default:
                throw new IllegalArgumentException("Invalid price code: " + priceCode);
        }
    }


    public void setPriceCode(Price price) {
        _price = price;
    }

    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        // add bonus for a two-day new release rental
        return _price.getFrequentRenterPoints(daysRented);
    }

    public String getTitle() {
        return _title;
    }
}

