package SerializedTrucks;

import jdk.jshell.spi.ExecutionControl;

import java.io.Writer;

public class Car extends Vehicle implements JSONSerializable, DatabaseObject {
    public Car(CarDriver driver) {
        super(driver);
    }

    @Override
    public void store() {
        System.out.println("Storing Car into database");
        getDriver().store();
    }

    @Override
    public void serializeJSON(Writer writer) {
        System.out.println("Serializing Car into JSON");

        getDriver().serializeJSON(writer);
    }

    @Override
    public void serializeToXML(Writer writer) {
        System.out.println("Serializing Car into XML");

        getDriver().serializeToXML(writer);
    }

}
