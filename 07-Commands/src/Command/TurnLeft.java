package Command;

import CarGame.Car;

public class TurnLeft implements Command {
    private final Car car;

    public TurnLeft(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.turnLeft();
    }
}
