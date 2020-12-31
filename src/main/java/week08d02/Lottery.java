package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        int number = 0;
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            numbers.add(rnd.nextInt(90)+1);
        }
        return numbers;
    }
}
