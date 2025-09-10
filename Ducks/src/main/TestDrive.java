package main;

import ducks.*;
import fly.FlyLikeRocket;
import fly.FlyWithWings;
import quack.SingLikeCanary;

import java.lang.reflect.InvocationTargetException;

public class TestDrive {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.display();
        mallard.performQuack();
        mallard.swim();
        mallard.performFly();


        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.performQuack();
        redhead.swim();
        redhead.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.setFlyBehavior(new FlyLikeRocket());
        rubberDuck.performFly();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.swim();

        decoy.setFlyBehavior(new FlyWithWings());
        decoy.performFly();

    }
}