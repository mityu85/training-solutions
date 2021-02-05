package collectionsmap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LogParser {

    public static final int NUMBER_OF_ELEMENTS = 3;
    public static final int POSITION_OF_IP = 0;
    public static final int POSITION_OF_DATE = 1;
    public static final int POSITION_OF_USER = 2;
    public static final String DELIMITER = ":";
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Map<String, List<Entry>> parseLog(String log) {


        try (Scanner sc = new Scanner(log)) {

            Map<String, List<Entry>> elements = new HashMap<>();
            while (sc.hasNext()) {
                String line = sc.next();
                String[] temp = line.split(DELIMITER);
                if (temp.length != NUMBER_OF_ELEMENTS) {
                    throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
                }
                LocalDate entryDate = parseDate(temp[POSITION_OF_DATE]);
                fillMap(elements, new Entry(temp[POSITION_OF_IP], entryDate, temp[POSITION_OF_USER]));
            }
            return elements;
        }
    }

    private void fillMap(Map<String, List<Entry>> elements, Entry entry) {
        if (!elements.containsKey(entry.getIpAddress())) {
            elements.put(entry.getIpAddress(), new ArrayList<>());
        }
        elements.get(entry.getIpAddress()).add(entry);
    }

    private LocalDate parseDate(String date) {
        try {
            return LocalDate.parse(date, DATE_FORMAT);
        }
        catch (DateTimeParseException pe) {
            throw new IllegalArgumentException("Incorrect log: incorrect date");
        }
    }
}
