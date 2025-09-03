package Product;

public class Electronic extends Product {

    private String resolution;
    public Electronic(String name, Double price, String resolution) {
        super(name, price);
        this.resolution = resolution;
    }

    public double getPrice() {
        double afterTax = super.getPrice() * 1.18;
        return afterTax;
    }

    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "resolution='" + resolution + '\'' +
                "} : " + super.toString();
    }
}
