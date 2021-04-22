package week11d03;

public class CharCounter {

    public int countChars(String[] chars) {
        int temp = 1;
        int counter = 0;
        char[] letters = new char[chars[0].length()];
        for (int c = 0; c < chars[0].length(); c++) {
            letters[c] = chars[0].charAt(c);
        }
        counter = getCounter(chars, temp, counter, letters);
        return counter;
    }

    private int getCounter(String[] chars, int temp, int counter, char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            temp = getTemp(chars, temp, letters, i);
            if (temp == chars.length) {
                counter++;
                temp = 1;
            }
        }
        return counter;
    }

    private int getTemp(String[] chars, int temp, char[] letters, int i) {
        for (int j = 1; j < chars.length; j++) {
            if (chars[j].contains(String.valueOf(letters[i]))) {
                temp++;
            }
        }
        return temp;
    }
}
