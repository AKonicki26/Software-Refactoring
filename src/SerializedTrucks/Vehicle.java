package SerializedTrucks;

public abstract class Vehicle implements XMLSerializable, JSONSerializable, DatabaseObject {
    public Vehicle(Driver driver) {
        this.driver = driver;
    }

    private Driver driver;


    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
