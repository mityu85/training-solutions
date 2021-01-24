package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class NumberStat {

    private List<Integer> numbers = new ArrayList<>();

    private void uploadListFromFile() {
        Path path = Path.of("src/main/resources/numbers.txt");
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                for (int i = 0; i < 3; i++) {
                    numbers.add(Integer.parseInt(temp[i]));
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
    }

    public int numberStat() {
        int minValue = Integer.MAX_VALUE;
        boolean itHas = false;
        List<Number> numberList = new ArrayList<>();
        uploadListFromFile();
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("The list is null");
        }
        for (Integer number: numbers) {
            if (numberList.isEmpty()) {
                numberList.add(new Number(number, 1));
            } else {
                for (int i = 0; i < numberList.size(); i++) {
                    if (number == numberList.get(i).getValue()) {
                        numberList.get(i).add();
                        itHas = true;
                        break;
                    }
                }
                if (!itHas) {
                    numberList.add(new Number(number, 1));
                }
            }
            itHas = false;
        }
        for (Number numberItem: numberList) {
            if (numberItem.getQuantity() == 1 && numberItem.getValue() < minValue) {
                minValue = numberItem.getValue();
            }
        }
        return minValue;
    }
}
