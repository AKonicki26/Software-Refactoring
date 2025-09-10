package ducks;

import fly.CannotFly;
import quack.CannotQuack;
import quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.name = "Rubber Duck";
        flyBehavior = new CannotFly();
        this.quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I am " + name);
    }
}
