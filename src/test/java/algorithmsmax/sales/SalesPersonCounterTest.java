package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesPersonCounterTest {

        List<SalesPerson> salespersons = Arrays.asList(
                new SalesPerson("John", 600, 500),
                new SalesPerson("Bill", 200, 300),
                new SalesPerson("Kate", 700, 100),
                new SalesPerson("Mary", 700, 300),
                new SalesPerson("Karl", 200, 50)
        );

        @Test
        public void testSalesPersonWithMaxAmount() {
            SalesPersonCounter maxAmount = new SalesPersonCounter();

            assertEquals(700, maxAmount.salesPersonWithMaxAmount(salespersons).getAmount());
            assertEquals(100, maxAmount.salesPersonWithMaxAmount(salespersons).getTarget());
        }

        @Test
        public void testSalesPersonWithAboveTarget() {
            SalesPersonCounter aboveTarget = new SalesPersonCounter();

            assertEquals(700, aboveTarget.salesPersonWithMaxAboveTarget(salespersons).getAmount());
            assertEquals(100, aboveTarget.salesPersonWithMaxAmount(salespersons).getTarget());
        }

        @Test
        public void testSalesPersonWithBelowTarget() {
            SalesPersonCounter belowTarget = new SalesPersonCounter();

            assertEquals(200, belowTarget.salesPersonWithMaxBelowTarget(salespersons).getAmount());
            assertEquals(300, belowTarget.salesPersonWithMaxBelowTarget(salespersons).getTarget());
        }
    }
