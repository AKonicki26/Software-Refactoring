// Created by Astrid Konicki
package Command;

import CarGame.Car;

public class SlowDown implements Command {
    private final Car car;

    public SlowDown(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.slowDown();
    }
}
