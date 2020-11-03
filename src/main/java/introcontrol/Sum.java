package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int b = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". szám: ");
            int a = sc.nextInt();
            sc.nextLine();
            b += a;
        }
        System.out.println(b);
    }
}
