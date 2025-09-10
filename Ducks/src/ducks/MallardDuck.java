package ducks;

import fly.FlyWithWings;
import quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.name = "Mallard Duck";
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am " + name);
    }
}
