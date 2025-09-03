package Product;

public class Food extends Product{
    private  int calories;
    public Food(String name, Double price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.10;
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "Food{" +
                "calories=" + calories +
                "} : " + super.toString();
    }
}
