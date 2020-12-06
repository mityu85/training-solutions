package week06d03;

public class WordEraser {

    public String eraseWord(String words, String word) {
        String resultWord = "";
        String[] wordsArray = words.split(" ");
        for (String wordItem: wordsArray) {
            if (!wordItem.equals(word)) {
                resultWord += wordItem + " ";
            }
        }
        return resultWord.trim();
    }
}
