package stringscanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringScanner {

    private boolean isEmpty(String str) {

        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public int readAndSumValues(String intString, String delimiter) {

        if (isEmpty(intString)) {
            throw new IllegalArgumentException("Empty String!");
        }
        int sum = 0;
        if (isEmpty(delimiter)) {
            return readAndSumValues(intString);
        } else {
            Scanner sc = new Scanner(intString).useDelimiter(delimiter);
            List<Integer> integerList = new ArrayList<>();
            while(sc.hasNext()) {
                integerList.add(sc.nextInt());
            }
            for (int i: integerList) {
                sum += i;
            }
        }
        return sum;
    }

    public int readAndSumValues(String intString) {

        if (isEmpty(intString)) {
            throw new IllegalArgumentException("Empty String!");
        }

        Scanner sc = new Scanner(intString);
        List<Integer> integerList = new ArrayList<>();
        int sum = 0;
        while(sc.hasNext()) {
            integerList.add(sc.nextInt());
        }
        for (int i: integerList) {
            sum += i;
        }
        return sum;
    }

    public String filterLinesWithWordOccurrences(String text, String word) {

        if (isEmpty(text)) {
            throw new IllegalArgumentException("Empty String!");
        }

        Scanner sc = new Scanner(text);
        StringBuilder sb = new StringBuilder();
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.contains(word)) {
                sb.append(line);
                sb.append("\n");
            }
        }
        return sb.toString().trim();
    }
}
