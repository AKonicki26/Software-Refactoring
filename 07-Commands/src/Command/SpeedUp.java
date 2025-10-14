// Created by Astrid Konicki
package Command;

import CarGame.Car;

public class SpeedUp implements Command {
    private final Car car;

    public SpeedUp(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.speedUp();
    }
}
