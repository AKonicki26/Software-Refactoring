package Command;

import CarGame.Car;

public class TurnRight implements Command {
    private final Car car;

    public TurnRight(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.turnRight();
    }
}
