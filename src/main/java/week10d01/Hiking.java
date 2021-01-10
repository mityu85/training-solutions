package week10d01;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> coordinates) {
        if (coordinates.size() != 4) {
            throw new IllegalArgumentException();
        }
        Double[] coordinateArray = new Double[4];
        for (int i = 0; i < coordinates.size(); i++) {
            coordinateArray[i] = coordinates.get(i);
        }
        return (coordinateArray[1] - coordinateArray[0]) + (coordinateArray[3] - coordinateArray[2]);
    }
}
