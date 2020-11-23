package immutable.satellite;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private final List<Satellite> satellites = new ArrayList<>();

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public void registerSatellite(Satellite satellite) {
        if (satellite == null) {
            throw new NullPointerException("Parameter must not be null!");
        }
        satellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        if (isEmpty(registerIdent)) {
            throw new IllegalArgumentException("registerIndent");
        }
        if (satellites.size() == 0) {
            throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + registerIdent);
        }

        Satellite satelliteResult = null;
        for (Satellite satellite : satellites) {
            if (satellite.getRegisterIdent().equals(registerIdent)) {
                satelliteResult = satellite;
            }
        }
        return satelliteResult;
    }

    public String toString() {
        return satellites.toString();
    }
}
