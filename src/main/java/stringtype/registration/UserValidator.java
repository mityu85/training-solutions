package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return username != "" ? true : false;
    }

    public boolean isValidPassword(String Password1, String Password2) {
        String s = Password1 + Password2;
        return Password1.equals(Password2) && s.length() >= 16 ? true : false;
    }

    public boolean isValidEmail(String email) {
        int l = email.length() >= 2 ? email.length() : 2;
        String lastLetter = email.substring(l-1, l);
        int at = email.indexOf("@");
        //System.out.println(email.indexOf("@"));
        //System.out.println(email.substring(at+1, at+2));
        //System.out.println(lastLetter);
        return email.indexOf("@") == 0 || email.indexOf("@") == -1 ||
                email.indexOf(".") == -1 || lastLetter.equals(".") ||
                email.substring(at+1, at+2).equals(".") ? false : true;
    }
}
