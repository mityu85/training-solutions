package algorithmsmax.sales;

import java.util.List;

public class SalesPersonCounter {

    public SalesPerson salesPersonWithMaxAmount(List<SalesPerson> salesPeople) {

        SalesPerson salesPersonMax = null;
        for (SalesPerson salesPerson: salesPeople) {
            if (salesPersonMax == null || salesPerson.getAmount() > salesPersonMax.getAmount()) {
                salesPersonMax = salesPerson;
            }
        }
        return salesPersonMax;
    }

    public SalesPerson salesPersonWithMaxAboveTarget(List<SalesPerson> salesPeople) {

        SalesPerson salesPersonMax = null;
        for (SalesPerson salesPerson: salesPeople) {
            if (salesPersonMax == null || salesPerson.getDifference() > salesPersonMax.getDifference()) {
                salesPersonMax = salesPerson;
                            }
        }
        return salesPersonMax;
    }

    public SalesPerson salesPersonWithMaxBelowTarget(List<SalesPerson> salesPeople) {

        SalesPerson salesPersonMax = null;
        for (SalesPerson salesPerson: salesPeople) {
            if (salesPersonMax == null || salesPerson.getDifference() < salesPersonMax.getDifference()) {
                salesPersonMax = salesPerson;
            }
        }
        return salesPersonMax;
    }
}
