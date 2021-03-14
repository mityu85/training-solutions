package exam03retake01;

public class CdvCheck {


    public boolean check(String id) {
        if (id.length() != 10 ) {
            throw new IllegalArgumentException("Too many numbers");
        }
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i * Integer.parseInt(id.substring(i-1, i));
        }
        return  sum % 11 == Integer.parseInt(id.substring(9));
    }

    private boolean isNumber(String id) {
        try {
            Integer.parseInt(id);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
