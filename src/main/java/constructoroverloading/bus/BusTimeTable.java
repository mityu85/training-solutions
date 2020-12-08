package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    List<SimpleTime> timeTable;

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> tempTimeTable = new ArrayList<>();
        for (int i = firstHour; i <= lastHour; i++) {
            tempTimeTable.add(new SimpleTime(i, everyMinute));
        }
        timeTable = tempTimeTable;
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime nextBus(SimpleTime actual) {
        for (int i = 0; i < timeTable.size(); i++) {
            if (timeTable.get(i).difference(actual) >= 0) {
                return timeTable.get(i);
            }
        }
        throw new IllegalStateException("No more time!");
    }
}
