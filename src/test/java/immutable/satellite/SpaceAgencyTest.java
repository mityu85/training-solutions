package immutable.satellite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpaceAgencyTest {

    @Test
    public void nullParameterShouldThrowException() throws NullPointerException {
        Exception ex = assertThrows(NullPointerException.class, () -> new SpaceAgency().registerSatellite(null));
        assertEquals("Parameter must not be null!", ex.getMessage());
    }

    @Test
    public void testRegisterSatellite() {
        // Given
        SpaceAgency sa = new SpaceAgency();
        // When
        sa.registerSatellite((new Satellite(new CelestialCoordinates(12, 23, 45), "ASD345")));
        sa.registerSatellite((new Satellite(new CelestialCoordinates(22, 33, 44), "QWE789")));
        //Then
        assertEquals("[RegIdent: ASD345 x: 12.0, y: 23.0, z: 45.0, RegIdent: QWE789 x: 22.0, y: 33.0, z: 44.0]", sa.toString());
    }

    @Test
    public void testNotFoundSatelliteByRegisterIdent() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new SpaceAgency().findSatelliteByRegisterIdent("XXX123"));
        assertEquals("Satellite with the given registration cannot be found!XXX123", ex.getMessage());
    }

    @Test
    public void testFindSatelliteByRegisterIdent() {
        // Given
        SpaceAgency sa = new SpaceAgency();
        // When
        sa.registerSatellite((new Satellite(new CelestialCoordinates(12, 23, 45), "ASD345")));
        sa.registerSatellite((new Satellite(new CelestialCoordinates(22, 33, 44), "QWE789")));
        //Then
        assertEquals("RegIdent: QWE789 x: 22.0, y: 33.0, z: 44.0", sa.findSatelliteByRegisterIdent("QWE789").toString());
    }
}
