package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.*;

public class BalatonStorm {

    public List<String> getStationsInStorm(BufferedReader reader) {
        try (BufferedReader br = new BufferedReader(reader)) {
          Set<String> stations = new TreeSet<>(Collator.getInstance(new Locale("hu", "HU")));
          Map<String, String> map = new HashMap<>();
          String line;
          while ((line = br.readLine()) != null) {
              if (line.contains("},")) {
                  map.clear();
              }
              if (line.contains(":")) {
                  String[] temp = line.trim().split(":");
                  map.put(temp[0], temp[1]);
                  String id = map.get("\"level\"");
                  if (id != null && id.equals(" 3,")) {
                      stations.add(map.get("\"allomas\"").substring(2, map.get("\"allomas\"").length()-2));
                  }
              }
          }
          return new ArrayList<>(stations);
        } catch (IOException e) {
            throw new IllegalStateException("File cannot read");
        }
    }
}
