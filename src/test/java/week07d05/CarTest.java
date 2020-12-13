package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void testCreate() {
        Car car = new Car();
        assertEquals(TransmissionType.AUTOMATIC, car.getTransmissionType());
        car = new Car(7, TransmissionType.MANUAL);
        assertEquals("Vehicle{numberOfGears=7, transmissionType=MANUAL}", car.toString());
    }
}
