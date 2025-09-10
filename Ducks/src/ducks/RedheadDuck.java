package ducks;

import fly.FlyWithWings;
import quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.name = "Redhead Duck";
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am " + name);
    }
}
