package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList;

    public Store(List<Product> productList) {
        this.productList = new ArrayList<>(productList);
    }

    public List<StringBuilder> getProductsByCategory() {
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        List<StringBuilder> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (Product product: productList) {
            if (product.getCategory().equals(Category.DAIRY)) {
                counter1++;
            }
            if (product.getCategory().equals(Category.OTHER)) {
                counter2++;
            }
            if (product.getCategory().equals(Category.FROZEN)) {
                counter3++;
            }
            if (product.getCategory().equals(Category.BAKEDGOODS)) {
                counter4++;
            }
        }
        sb.append(Category.DAIRY + " " + counter1 + " " +
                Category.OTHER + " " + counter2 + " " +
                Category.FROZEN + " " + counter3 + " " +
                Category.BAKEDGOODS + " " + counter4);
        result.add(sb);
        return result;
    }
}
