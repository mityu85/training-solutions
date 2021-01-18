package iostringwriter.longwords;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {

    private void wordsLength(List<String> words, Writer writer) {
        PrintWriter pw = new PrintWriter(writer);
        for (String word: words) {
           pw.println(word + " " + word.length());
        }
    }

    public String writeWithStringWriter(List<String> words) {
        StringWriter sw = new StringWriter();
        try (sw) {
            wordsLength(words, sw);
            return sw.toString();
        } catch (IOException e) {
            throw new IllegalStateException("File can not read", e);
        }
    }
}
