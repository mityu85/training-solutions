package enumtype.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {

    private final int DEFAULT_SCALE = 4;

    BigDecimal convert(BigDecimal length, LengthUnit source, LengthUnit target) {
        return length.multiply(new BigDecimal(source.getMillimeter()))
                .divide(new BigDecimal(target.getMillimeter()), DEFAULT_SCALE, RoundingMode.HALF_UP);
    }

    public List<LengthUnit> siUnits() {
        List<LengthUnit> lengthUnits = new ArrayList<>();
        for (LengthUnit unitList: LengthUnit.values()) {
            if (unitList.isSi() == true) {
                lengthUnits.add(unitList);
            }
        }
        return lengthUnits;
    }
}
