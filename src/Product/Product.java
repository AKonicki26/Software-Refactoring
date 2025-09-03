package Product;

public class Product {

    private  String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected   double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=$" + String.format("%.2f", getPrice()) +
                '}';
    }
}
