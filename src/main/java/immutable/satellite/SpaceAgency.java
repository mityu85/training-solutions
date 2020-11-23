package immutable.satellite;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private final List<Satellite> satellites = new ArrayList<>();

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public void registerSatellite(Satellite satellite) {

        satellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        if (isEmpty(registerIdent)) {
            throw new IllegalArgumentException("registerIndent");
        }

        Satellite satelliteResult = null;
        for (Satellite satellite: satellites) {
            if (satellite == null) {
                throw new IllegalStateException("Satellite");
            }
            if (satellite.getRegisterIdent().equals(registerIdent)) {
                satelliteResult = satellite;
            }
        }
        return satelliteResult;
    }
}
