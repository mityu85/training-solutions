package algorithmsum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int amountSum(List<SalesPerson> salesPersons) {
        int sum = 0;
        for (SalesPerson salesPerson: salesPersons) {
            sum += salesPerson.getAmount();
        }
        return sum;
    }
}
