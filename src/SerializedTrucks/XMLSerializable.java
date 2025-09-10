package SerializedTrucks;

import java.io.Writer;

/**
 * Allows for implementing classes to serialize themselves into XML
 */
public interface XMLSerializable {

    /**
     * Serialize into an XML string
     * @param writer - the writer to serialize the object in
     */
    void serializeToXML(Writer writer);
}
