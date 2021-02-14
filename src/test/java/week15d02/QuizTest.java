package week15d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuizTest {

    Quiz quiz = new Quiz();

    @BeforeEach
    public void upLoad() {
        quiz.upLoadQuiz(Path.of("src/main/resources/quiz.txt"));
    }

    @Test
    public void testFileUpload() {
        assertEquals(8, quiz.getQuiz().entrySet().size());
        assertEquals(List.of("1526", "1", "tortenelem"), quiz.getQuiz().get("Mikor volt a mohacsi vesz?"));
    }

    @Test
    public void testQuestionByTopic() {
        assertEquals(5, quiz.getQuestionsByTopic("tortenelem").size());
        assertEquals(3, quiz.getQuestionsByTopic("matematika").size());
    }

    @Test
    public void testRandomQuestion() {
        Random rand = new Random();
        assertEquals("Melyik evben kezdodott a Honfoglalas?[895, 1, tortenelem]", quiz.randomQuestions());
    }

    @Test
    public void testOrderedQuestionsByTopic() {
        assertEquals("", quiz.orderedQuestionsByTopic());
    }
}
