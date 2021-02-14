package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Quiz {

    private Map<String, List<String>> quiz = new LinkedHashMap<>();

    public Map<String, List<String>> getQuiz() {
        return new HashMap<>(quiz);
    }

    public void upLoadQuiz(Path path) {
        int lineCounter = 0;
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                lineSelector(line, quiz, lineCounter);
                lineCounter++;
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
    }

    private void lineSelector(String line, Map<String, List<String>> m, int lineCounter) {
        List<String> values = new ArrayList<>();
        if (lineCounter % 2 == 0) {
            m.put(line, values);
        } else {
            List<String> keys = new ArrayList<>(m.keySet());
            values = lineSeparator(line, " ");
            m.put(keys.get(keys.size() - 1) , values);
        }
    }

    private List<String> lineSeparator(String line, String delimiter) {
        List<String> values = new ArrayList<>();
        String[] temp = line.split(delimiter);
        for (String t: temp) {
            values.add(t);
        }
        return values;
    }

    public Set<String> getQuestionsByTopic(String topic) {
        Set<String> questions = new HashSet<>();
        for (String key: quiz.keySet()) {

                if (quiz.get(key).contains(topic)) {
                    questions.add(key);

            }
        }
        return questions;
    }

    public String randomQuestions() {
        List<String> keys = new ArrayList<>();
        Random rand = new Random(5);
        int index = rand.nextInt(quiz.size());
        for (String key: quiz.keySet()) {
            keys.add(key);
        }
        return keys.get(index) + quiz.get(keys.get(index)).toString();
    }

    public Map<String, Set<String>> orderedQuestionsByTopic() {
        Map<String, Set<String>> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (List<String> values: quiz.values()) {
            if (map.containsKey(values.get(2))) {
                map.get(values.get(2)).add(values.get(0));
                map.get(values.get(2)).add(values.get(1));
                //map.get(values.get(2)).add(getQuestionsByTopic(values.get(2)).toString());
            } else {
                map.put(values.get(2), getQuestionsByTopic(values.get(2)));
            }
        }
        return map;
    }
}
