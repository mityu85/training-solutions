package primitivetypes;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypes {

    public void toBinaryString(int n) {
        List<Integer> binaryStringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(n);
        for (int i = 0; i < 32; i++) {
        //    if (integerList.get(i) >= 0) {
                int k = integerList.get(i) / 2;
                integerList.add(k);
                int j = integerList.get(i) % 2;
                binaryStringList.add(j);
        /*    } else {
                binaryStringList.add(0);
            }*/
        }
        for (int item = binaryStringList.size()-1; item >= 0; item--) {
            System.out.print(binaryStringList.get(item));
        }
    /*    System.out.println();
        for (int item = integerList.size()-1; item >= 0; item--) {
            System.out.print(integerList.get(item));
        }*/
    }
}
