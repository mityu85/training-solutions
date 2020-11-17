package formatlocaleprintf;

import java.util.Locale;
import java.util.MissingFormatArgumentException;

public class PrintFormat {

    public String checkException(String formatString, Integer i, Integer j) {

        try {
            return String.format(new Locale("hu", "HU"), formatString, i, j);
        } catch (MissingFormatArgumentException ex) {
            throw new IllegalArgumentException("Less objects then expected in format String!", ex);
        }
    }
    public String printFormattedText(Double number) {

        return String.format("%f", number);
    }
    public String printFormattedText(int count, String fruit) {

        return String.format("%d %s", count, fruit);
    }
    public String printFormattedText(int number) {

        return String.format("%d", number);
    }
    public String printFormattedText(Integer i, Integer j, Integer k) {
        return String.format("%i %j %k", i, j, k);
    }
}
