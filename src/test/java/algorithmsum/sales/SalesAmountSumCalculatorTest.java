package algorithmsum.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesAmountSumCalculatorTest {

    @Test
    public void testAmount() {

        SalesPerson sp1 = new SalesPerson("John Doe", 125000);
        SalesPerson sp2 = new SalesPerson("Jane Doe", 180000);
        SalesPerson sp3 = new SalesPerson("Jack Doe", 250000);
        SalesPerson sp4 = new SalesPerson("Trainee", 45000);

        List<SalesPerson> salesPersonList = Arrays.asList(sp1, sp2, sp3, sp4);

        assertEquals(600000, new SalesAmountSumCalculator().amountSum(salesPersonList));
    }
}
