package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        System.out.println("Please give a username:");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        System.out.println("Please give a password (min. 8 characters):");
        String password1 = sc.nextLine();
        System.out.println("Please confirm the password (min. 8 characters):");
        String password2 = sc.nextLine();

        System.out.println("Please give an email address:");
        String email = sc.nextLine();

        UserValidator uv = new UserValidator();

        System.out.println("username: " + username + " " + uv.isValidUsername(username));
        System.out.println("password: " + "******** " + uv.isValidPassword(password1, password2));
        System.out.println("email: " + email + " " + uv.isValidEmail(email));
    }
}
