package week06d01;

import java.text.NumberFormat;
import java.util.Locale;

public class SeparatedSumMain {

    public static void main(String[] args) {

        String s = "2,15; 3,18; -4,58; 1,98; -6,38; -8,75";
        SeparatedSum separatedSum = new SeparatedSum();
        System.out.println(separatedSum.sum(s));
    }
}
