package exceptionclass.course;

public class InvalidTimeException extends RuntimeException {

    private int time;
    private String str;

    public InvalidTimeException(String message, int time) {
        super(message);
        this.time = time;
    }

    public InvalidTimeException(String message, String str) {
        super(message);
        this.str = str;
    }

    public int getTime() {
        return time;
    }

    public String getStr() {
        return str;
    }
}
