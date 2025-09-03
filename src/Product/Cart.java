package Product;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class Cart {

    private final List<Product> basket = new LinkedList<Product>();

    public void addToBasket(Product... products) {
        Collections.addAll(this.basket, products);
    }

    public void displayBasket() {
        for (Product product : this.basket) {
            System.out.println(product);
        }
    }
}
