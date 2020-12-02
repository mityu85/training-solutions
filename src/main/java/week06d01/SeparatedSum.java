package week06d01;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SeparatedSum {

    public List<Float> sum(String s) {
        float minusNumbers = 0.0f;
        float positiveNumbers = 0.0f;
        List<Float> floats = new ArrayList<>();
        String[] delimitedS = s.split(";");
        for (int i = 0; i < delimitedS.length; i++) {
            String replaceComaToDot = delimitedS[i].replace(",", ".");
            float temp = Float.parseFloat(replaceComaToDot);
            if (temp < 0.0) {
                minusNumbers += temp;
            }
            if (temp >= 0.0) {
                positiveNumbers += temp;
            }
        }
        floats.add(minusNumbers);
        floats.add(positiveNumbers);
        return floats;
    }
}
