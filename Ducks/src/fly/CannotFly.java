package fly;

public class CannotFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
