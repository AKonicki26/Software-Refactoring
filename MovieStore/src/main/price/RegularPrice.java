// Astrid Konicki
package main.price;

public class RegularPrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        double price = 2;
        if (daysRented > 2)
            price += (daysRented - 2) * 1.5;

        return price;
    }
}
