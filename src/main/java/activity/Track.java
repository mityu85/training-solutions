package activity;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public double getRectangleArea() {
       double a = findMinimumCoordinate().getLongitude() - findMaximumCoordinate().getLongitude();
       double b = findMinimumCoordinate().getLatitude() - findMaximumCoordinate().getLatitude();
       return a * b;
    }

    public double getDistance() {
        double sumDistance = 0;
        for (int i = 0; i < trackPoints.size()-1; i++) {
            sumDistance += trackPoints.get(i).getDistanceFrom(trackPoints.get(i+1));
        }
        return sumDistance;
    }

    public double getFullDecrease() {
        double sumDecrease = 0;
        for (int i = 0; i < trackPoints.size()-1; i++) {
            if (trackPoints.get(i).getElevation() > trackPoints.get(i+1).getElevation()) {
                sumDecrease += trackPoints.get(i).getElevation() - trackPoints.get(i+1).getElevation();
            }
        }
        return sumDecrease;
    }

    public double getFullElevation() {
        double sumElevation = 0;
        for (int i = 0; i < trackPoints.size()-1; i++) {
            if (trackPoints.get(i).getElevation() < trackPoints.get(i+1).getElevation()) {
                sumElevation += trackPoints.get(i+1).getElevation() - trackPoints.get(i).getElevation();
            }
        }
        return sumElevation;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate() {
        double longitude = Double.MIN_VALUE;
        double latitude = Double.MIN_VALUE;
        for (int i = 0; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getCoordinate().getLongitude() > longitude) {
                longitude = trackPoints.get(i).getCoordinate().getLongitude();
            }
            if (trackPoints.get(i).getCoordinate().getLatitude() > latitude) {
                latitude = trackPoints.get(i).getCoordinate().getLatitude();
            }
        }
        return new Coordinate(latitude, longitude);
    }

    public Coordinate findMinimumCoordinate() {
        double longitude = Double.MAX_VALUE;
        double latitude = Double.MAX_VALUE;
        for (int i = 0; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getCoordinate().getLongitude() < longitude) {
                longitude = trackPoints.get(i).getCoordinate().getLongitude();
            }
            if (trackPoints.get(i).getCoordinate().getLatitude() < latitude) {
                latitude = trackPoints.get(i).getCoordinate().getLatitude();
            }
        }
        return new Coordinate(latitude, longitude);
    }

    public void loadFromGpx(InputStream is) {
        double lat = 0.0;
        double lon = 0.0;
        double ele = 0.0;
        Coordinate coordinate = new Coordinate(lat, lon);
        try (BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/track.gpx"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().startsWith("<trkpt")) {
                    lat = Double.parseDouble(line.trim().substring(12, 22));
                    lon = Double.parseDouble(line.trim().substring(29, 39));
                    coordinate = new Coordinate(lat, lon);
                }
                if (line.trim().startsWith("<ele")) {
                    ele = Double.parseDouble(line.trim().substring(5, 10));
                    TrackPoint trackPoint = new TrackPoint(coordinate, ele);
                    trackPoints.add(trackPoint);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found", e);
        }
    }
}
