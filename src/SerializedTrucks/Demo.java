package SerializedTrucks;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class Demo {

    public static void main(String[] args) {

        // create a string writer to be used for serialization
        Writer writer = new StringWriter();

        // Create a car with a driver
        CarDriver carDriver = new CarDriver();
        Car car = new Car(carDriver);

        car.serializeJSON(writer);
        car.store();

        try {
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // create a truck with a driver
        TruckDriver truckDriver = new TruckDriver();
        Truck truck = new Truck(truckDriver);

        truck.serializeToXML(writer);
        truck.store();

        try {
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
