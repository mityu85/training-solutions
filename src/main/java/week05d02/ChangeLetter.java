package week05d02;

import java.util.Arrays;

public class ChangeLetter {

    public String changeVowels(String word) {
        String newWord = null;
        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i+1);
            switch (letter.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                  if (newWord == null) {
                      newWord = word.replace(word.charAt(i), '*');
                  }
                 newWord = newWord.replace(newWord.charAt(i), '*');
            }
        }
        return newWord;
    }

    public static void main(String[] args) {
        ChangeLetter changeLetter = new ChangeLetter();
        System.out.println(changeLetter.changeVowels("Ones upon a time..."));
    }
}
