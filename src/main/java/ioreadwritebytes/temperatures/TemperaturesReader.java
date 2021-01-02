package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {

    public Temperatures readTemperatures(String pathString) {
        Temperatures temperatures = null;
        try {
            temperatures = new Temperatures(Files.readAllBytes(Path.of(pathString)));
        } catch (IOException e) {
            throw new IllegalStateException("File cannot be read", e);
        }
        return temperatures;
    }
}
