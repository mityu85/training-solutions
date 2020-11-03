package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {

        System.out.println("Give a number: ");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();

        if (numb > 100) {
            System.out.println("nagyobb, mint száz");
        } else {
            System.out.println("száz, vagy kisebb");
        }
    }
}
