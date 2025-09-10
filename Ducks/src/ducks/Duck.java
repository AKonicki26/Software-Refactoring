package ducks;

import fly.FlyBehavior;
import quack.Quack;
import quack.QuackBehavior;

import java.lang.reflect.InvocationTargetException;

public abstract class Duck {

    protected String name;
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public abstract void display();

    //@Override
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
