package immutable.satellite;

public class Satellite {

    private final String registerIdent;
    private CelestialCoordinates destinationCoordinates;

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public String getRegisterIdent() {
        return registerIdent;
    }

    public CelestialCoordinates getDestinationCoordinates() {
        return destinationCoordinates;
    }

    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent) {
        if (isEmpty(registerIdent)) {
            throw new IllegalArgumentException("Register ident must not be empty!");
        }

        this.registerIdent = registerIdent;
        this. destinationCoordinates = destinationCoordinates;
    }

    public void modifyDestination(CelestialCoordinates diff) {
        double x;
        double y;
        double z;

        x = diff.getX() + destinationCoordinates.getX();
        y = diff.getY() + destinationCoordinates.getY();
        z = diff.getZ() + destinationCoordinates.getZ();

        destinationCoordinates = new CelestialCoordinates(x, y, z);

    }

    public String toString() {

        return "RegIdent: " + registerIdent + " " + destinationCoordinates.toString();
    }

}
