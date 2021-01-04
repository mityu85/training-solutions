package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    private List<Band> bands = new ArrayList<>();

    public void addBandsToListFromFile(Path file) {
        try (BufferedReader bf = Files.newBufferedReader(file)) {
            String line;
            while((line = bf.readLine()) != null) {
                String[] temp = line.split(";");
                Band band = new Band(temp[0], Integer.parseInt(temp[1]));
                bands.add(band);
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found", e);
        }
    }

    public void writeListOfBandsWhichBeforThan(Path file, int year) {
        try (BufferedWriter bw = Files.newBufferedWriter(file)) {
            for (Band band: olderThan(year)) {
                bw.write(band.getName() + " " + band.getYear() + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not be written", e);
        }
    }

    private List<Band> olderThan(int year) {
        List<Band> bandList = new ArrayList<>();
        for (Band band: bands) {
            if (band.getYear() < year) {
                bandList.add(band);
            }
        }
        return bandList;
    }
}
