package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ShoppingList {

    private Map<String, List<String>> shopping = new HashMap<>();

    public Map<String, List<String>> getShopping() {
        return new HashMap<>(shopping);
    }

    public void upLoad(Path path) {

        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] keys = line.split(" ");
                String[] values = keys[1].split(",");
                List<String> valueList = new ArrayList<>();
                for (int i = 0; i < values.length; i++) {
                    valueList.add(values[i]);
                }
                shopping.put(keys[0], valueList);
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
    }

    public List<String> sortProductsById(String key) {
        List<String> tempList = new ArrayList<>();
        if (shopping.containsKey(key)) {
            tempList = shopping.get(key);
        }
        Collections.sort(tempList);
        return tempList;
    }

    public int countSoldProductsByName(String name) {
       int sum = 0;
       Collection<List<String>> lists = shopping.values();
       for (List<String> l: lists) {
           for (String s: l) {
               if (name.equals(s)) {
                   sum++;
               }
           }
       }
       return sum;
    }

    public int countProductsById(String key) {
        int value = 0;
        if (shopping.containsKey(key)) {
            value = shopping.get(key).size();
        }
        return value;
    }

    public Map<String, Integer> countEachProducts() {
        Collection<List<String>> products = shopping.values();
        Set<String> setOfProducts = new HashSet<>();
        Map<String, Integer> mapOfProducts = new HashMap<>();
        for (List<String> l: products) {
            for (String s: l) {
                setOfProducts.add(s);
            }
        }
        for (String s: setOfProducts) {
            mapOfProducts.put(s, countSoldProductsByName(s));
        }
        return mapOfProducts;
    }
}
