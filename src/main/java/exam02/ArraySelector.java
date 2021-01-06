package exam02;

import java.util.ArrayList;
import java.util.List;

public class ArraySelector {

    public String selectEvens(int[] array) {
        String s = "";
        List<String> evens = new ArrayList<>();
        if (array.length != 0) {
            s = "[";
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    evens.add(Integer.toString(array[i]));
                }
            }
            for (String even: evens) {
                s += even + ", ";
            }
            s = s.substring(0, s.length()-2) + "]";
        }
        return s;
    }
}
