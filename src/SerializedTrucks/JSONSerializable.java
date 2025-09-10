package SerializedTrucks;

import java.io.Writer;

/**
 * Allows for implementing classes to serialize themselves into JSON
 */
public interface JSONSerializable {
    /**
     * Serialize into a JSON string
     * @param writer - the writer to serialize the object in
     */
    void serializeJSON(Writer writer);
}
