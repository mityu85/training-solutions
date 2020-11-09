package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        System.out.println("3.5 + 1.2 * (3 - 2) / 2 = ?");
        Scanner scanner = new Scanner(System.in);
        double result = scanner.nextDouble();
        double d = 3.5 + 1.2 * (3.0 - 2.0) / 2.0;
        if (Math.abs(d - result) < 0.0001) {
            System.out.println("It's correct!");
        } else {
            System.out.println("Sorry, try again!");
        }
    }
}
