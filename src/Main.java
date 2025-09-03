import Product.Product;
import Product.*;
public class Main {
    public static void main(String[] args) {

        var electronic = new Electronic("TV", 15.99, "1080p");
        var food = new Food("bagel", 3.99, 250);

        Cart cart = new Cart();

        cart.addToBasket(electronic, food);

        cart.displayBasket();

    }
}