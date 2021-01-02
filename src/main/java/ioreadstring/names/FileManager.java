package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private final Path PATH = Path.of("src", "main", "resources","humanNames.txt");
    private List<Human> humans = new ArrayList<>();

    public List<Human> readFromFile() {
        try {
            List<String> names = Files.readAllLines(PATH);
            for (int i = 0; i < names.size(); i++) {
                String[] fullName = names.get(i).split(" ");
                Human human = new Human(fullName[0], fullName[1]);
                humans.add(human);
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found", e);
        }
        return humans;
    }

    public Path getPATH() {
        return PATH;
    }

    public List<Human> getHumans() {
        return humans;
    }
}
