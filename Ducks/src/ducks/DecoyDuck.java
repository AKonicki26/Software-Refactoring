package ducks;

import fly.CannotFly;
import quack.CannotQuack;
import quack.Quack;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a Decoy Duck");
    }

    public DecoyDuck() {
        this.name = "Decoy Duck";
        this.flyBehavior = new CannotFly();
        this.quackBehavior = new CannotQuack();
    }
}
