package week03d04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneParser {

    public List<Phone> parse() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(PhoneParser.class.getResourceAsStream("/phonenumbers.txt")))) {
            String line;
            List<Phone> phones = new ArrayList<>();
            while((line = br.readLine()) != null) {
                String[] temp = line.split("-");
                phones.add(new Phone(temp[0], temp[1]));
            }
            return phones;
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }

}
