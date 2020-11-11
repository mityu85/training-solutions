package controlselection.consonant;

public class ToConsonant {

    public char letters(char c) {

        char result;
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                result = (char) (c + 1);
                break;
            default:
                result = c;
        }
        return result;
    }

    public static void main(String[] args) {

        ToConsonant toConsonant = new ToConsonant();
        System.out.println(toConsonant.letters('a'));
        System.out.println(toConsonant.letters('b'));
        System.out.println(toConsonant.letters('e'));
    }
}
