import CarGame.Car;
import CarGame.CarGame;
import Command.SlowDown;
import Command.SpeedUp;
import Command.TurnLeft;
import Command.TurnRight;

public class CarTest {

    public static void main(String[] args) {
        CarGame carGame = new CarGame();
        Car car = new Car();

        TurnLeft turnLeft = new TurnLeft(car);
        TurnRight turnRight = new TurnRight(car);
        SpeedUp speedUp = new SpeedUp(car);
        SlowDown slowDown = new SlowDown(car);

        carGame.performRecordCommand(turnLeft);
        carGame.performRecordCommand(speedUp);
        carGame.performRecordCommand(slowDown);
        carGame.performRecordCommand(turnRight);

        System.out.println("REPLAY");
        carGame.replay();
    }
}