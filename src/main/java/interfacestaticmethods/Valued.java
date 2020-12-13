package interfacestaticmethods;

import java.util.List;

public interface Valued {

    double getValue();

    static double sum(List<Valued> valueList) {
        double sum = 0;
        for (Valued valueItem: valueList) {
            sum += valueItem.getValue();
        }
        return sum;
    }
}
