package week07d05;

public class MotorCycle extends Vehicle {

    private TransmissionType transmissionType;

    public MotorCycle() {
       setTransmissionType(TransmissionType.SEQUENTIAL);
    }

    public MotorCycle(int numberOfGears, TransmissionType transmissionType) {
        super(numberOfGears, transmissionType);
    }

    @Override
    public int getNumberOfGears() {
        return super.getNumberOfGears();
    }

    @Override
    public TransmissionType getTransmissionType() {
        return super.getTransmissionType();
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "transmissionType=" + transmissionType +
                '}';
    }
}
