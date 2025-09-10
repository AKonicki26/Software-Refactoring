package SerializedTrucks;

import java.io.Writer;

public class CarDriver extends Driver {

    @Override
    public void store() {
        System.out.println("Storing Car Driver into database");
    }

    @Override
    public void serializeJSON(Writer writer) {
        System.out.println("Serializing Car Driver into JSON");
    }

    @Override
    public void serializeToXML(Writer writer) {
        System.out.println("Serializing Car Driver into XML");
    }
}
