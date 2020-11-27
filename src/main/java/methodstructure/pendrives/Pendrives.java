package methodstructure.pendrives;

import java.util.ArrayList;
import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendrives) {
        Pendrive min = pendrives.get(0);
        for (int i = 0; i < pendrives.size(); i++) {
            if (min.comparePricePerCapacity(pendrives.get(i)) == 1) {
                min = pendrives.get(i);
            }
        }
        return min;
    }

    public Pendrive cheapest(List<Pendrive> pendrives) {
        Pendrive min = pendrives.get(0);
        for (int i = 0; i < pendrives.size(); i++) {
            if (pendrives.get(i).cheaperThan(min)) {
                min = pendrives.get(i);
            }
        }
        return min;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive pendrive: pendrives) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }
}
