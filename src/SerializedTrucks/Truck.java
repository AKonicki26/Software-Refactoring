package SerializedTrucks;

import java.io.Writer;

public class Truck extends Vehicle {
    public Truck(TruckDriver driver) {
        super(driver);
    }

    @Override
    public void store() {
        System.out.println("Storing Truck into database");
        getDriver().store();
    }

    @Override
    public void serializeJSON(Writer writer) {
        System.out.println("Serializing Truck into JSON");

        getDriver().serializeJSON(writer);
    }

    @Override
    public void serializeToXML(Writer writer) {
        System.out.println("Serializing Truck into XML");

        getDriver().serializeToXML(writer);
    }
}
