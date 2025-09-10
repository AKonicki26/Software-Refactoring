package SerializedTrucks;

import java.io.Writer;

public class TruckDriver extends Driver {
    @Override
    public void store() {
        System.out.println("Storing Truck Driver into database");
    }

    @Override
    public void serializeJSON(Writer writer) {
        System.out.println("Serializing Truck Driver into JSON");
    }

    @Override
    public void serializeToXML(Writer writer) {
        System.out.println("Serializing Truck Driver into XML");
    }
}
