package controliteration.pi;

public class PiGenerator {

    private final String POEM = "Nem a régi s durva közelítés,\n" +
            "Mi szótól szóig így kijön\n" +
            "Betűiket számlálva.\n" +
            "Ludolph eredménye már,\n" +
            "Ha itt végezzük húsz jegyen.\n" +
            "De rendre kijő még tíz pontosan,\n" +
            "Azt is bízvást ígérhetem.\n";

    private int counter;

    public String counterLetters() {
        String s = "";
        counter = 0;
        for (int i = 0; i < POEM.length()-1; i++) {
            if (Character.isAlphabetic(POEM.charAt(i))) {
                counter++;
            } else {
                if (s.length() == 1) {
                    s += ".";
                }
                if (counter != 0) {
                    s += counter;
                    counter = 0;
                }
            }
        }
        return s;
    }
}
