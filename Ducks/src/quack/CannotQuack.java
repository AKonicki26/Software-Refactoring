package quack;

public class CannotQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack :(");
    }
}
