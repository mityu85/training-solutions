package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    private List<State> states = new ArrayList<>();

    public void readStatesFromFile(String stringFileName) {
        try (BufferedReader bf = Files.newBufferedReader(Path.of(stringFileName))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] statesWithCapitals = line.split("-");
                State state = new State(statesWithCapitals[0], statesWithCapitals[1]);
                states.add(state);
            }
        } catch (IOException e) {
            throw new IllegalStateException("File is not found", e);
        }
    }

    public String findCapitalByStateName(String stateName) {
        String capital = null;
        for (State state: states) {
            if (stateName.equals(state.getStateName())) {
                capital = state.getCapital();
               return capital;
            }
        }
        throw new IllegalArgumentException();
    }

    public List<State> getStates() {
        return new ArrayList<>(states);
    }
}
