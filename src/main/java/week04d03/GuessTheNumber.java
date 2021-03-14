package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public void guess() {
        Random rand = new Random();
        int numb = rand.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Guess the number:");
            int n = sc.nextInt();
            if (n < numb) {
                System.out.println("The number is higher");
            }
            if (n > numb) {
                System.out.println("The number is smaller");
            }
            if (n == numb) {
                System.out.println("Congratulation! :)");
            }
        }
        System.out.println("The number was: " + numb);
    }
}
