package virtualmethod.vehicle;

public class Vehicle {

    private int vehicleWeight;

    public static final short PERSON_AVERAGE_WEIGHT = 75;

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public int getVehicleWeight() {
        return vehicleWeight;
    }

    public int getGrossLoad() {
        return vehicleWeight + PERSON_AVERAGE_WEIGHT;
    }

    public String toString() {
        return "Vehicle{vehicleWeight=" + 1000 + "}";
    }
}
