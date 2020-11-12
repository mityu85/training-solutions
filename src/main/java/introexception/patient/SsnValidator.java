package introexception.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {

        if (ssn.length() != 9) {
            return false;
        } else {
            try {
                int sum = 0;
                for (int i = 0; i < ssn.length()-1; i += 2) {
                    sum += ssn.charAt(i)*3;
                }
                for (int i = 1; i < ssn.length()-1; i += 2) {
                    sum += ssn.charAt(i)*7;
                }
                return ssn.charAt(8) == sum % 10;
            } catch (IllegalArgumentException iae) {
                return false;
            }
        }
    }
}
