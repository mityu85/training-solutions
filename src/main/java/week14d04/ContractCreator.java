package week14d04;

import java.util.List;

public class ContractCreator {

    Contract template;

    ContractCreator(String client, List<Integer> monthlyPrices) {
        this.template = new Contract(client, monthlyPrices);
    }

    public Contract getTemplate() {
        return template;
    }

    public Contract create(String name) {
        return new Contract(name, template.getMonthlyPrices());
    }
}
