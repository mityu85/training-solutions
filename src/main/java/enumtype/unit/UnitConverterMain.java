package enumtype.unit;

import java.math.BigDecimal;
import java.util.Arrays;

public class UnitConverterMain {

    public static void main(String[] args) {

        UnitConverter unitConverter = new UnitConverter();
        System.out.println(unitConverter.convert(new BigDecimal(1000), LengthUnit.CENTIMETER, LengthUnit.FOOT));

        System.out.println(Arrays.toString(LengthUnit.values()));
        System.out.println(unitConverter.siUnits());
    }
}
