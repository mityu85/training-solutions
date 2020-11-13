package stringbasic;

public class StringCreator {

    public String createStringForHeap() {
        String s = new String("apple");
        return s;
    }
    public String createStringForPool() {
        String s = "apple";
        return s;
    }
}
