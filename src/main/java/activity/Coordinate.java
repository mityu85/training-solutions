package activity;

public class Coordinate {

    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        if (latitude >= -90 && latitude <= 90) {
            this.latitude = latitude;
        } else {
            throw new IllegalArgumentException();
        }
        if (longitude >= -180 && longitude <= 180) {
            this.longitude = longitude;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
