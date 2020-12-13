package week07d02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DigitSum {

    public static int sumOfDigits(int x) {
        Integer value = x;
        Integer sum = 0;
        String str = value.toString();
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            characters.add(str.charAt(i));
        }
        for (Character character: characters) {
            sum += (int) character - 48;
        }
        return sum;
    }
}
