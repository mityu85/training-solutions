package week10d02;

import java.util.ArrayList;
import java.util.List;

public class BusStop {

    private List<Stop> stops = new ArrayList<>();

    private void collectDatas(List<Integer> integers) {
        int sum = 1;
        for (int i = 0; i < integers.size()-1; i++) {
            if (integers.get(i) == integers.get(i+1)) {
                sum++;
            } else {
                stops.add(new Stop(integers.get(i), sum));
                sum = 1;
            }
            stops.add(new Stop(integers.get(i), sum));
            /*if (integers.get(i+1) != integers.get(i)) {
                stops.add(new Stop(integers.get(i), sum));
            }*/
        }
    }

    public int getMaxIndex(List<Integer> integers) {
        collectDatas(integers);
        int stopNumber = 0;
        int maxIndex = Integer.MIN_VALUE;
        for (Stop stop: stops) {
            if (stop.getNumberOfPersons() > maxIndex) {
                maxIndex = stop.getNumberOfPersons();
                stopNumber = stop.getNumber();
            }
        }
        return stopNumber;
    }
}
