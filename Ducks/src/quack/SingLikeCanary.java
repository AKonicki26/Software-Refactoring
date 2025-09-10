package quack;

public class SingLikeCanary implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I am singing like a canary");
    }
}
