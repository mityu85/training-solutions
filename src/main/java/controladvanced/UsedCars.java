package controladvanced;

import java.util.ArrayList;
import java.util.List;

public class UsedCars {

    public List<String> filterLines(List<String> lines) {
        List<String> validLines = new ArrayList<>();
        for (String line: lines) {
            String[] parts = line.split(";");
            if(parts.length != 4) {
//Innen kezdve hiányzik jópár sor
                System.out.println("Not enough data in line...");
                continue;
            }

            if (parts[0].length() != 7 && !parts[0].contains("-")) {
                System.out.println("Invalid plate number");
                continue;
            }
            int year = Integer.parseInt(parts[1]);
            if (year > 2019 || year < 1970) {
                continue;
            }
            validLines.add(line);
        }
        return validLines;
    }
}
