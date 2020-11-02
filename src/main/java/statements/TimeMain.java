package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        System.out.println("Please give the hours:");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please give the minutes:");
        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please give the seconds:");
        int s = scanner.nextInt();
        scanner.nextLine();

        Time time1 = new Time(h,m,s);

        System.out.println("Please give another hours:");
        h = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please give another minutes:");
        m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please give another seconds:");
        s = scanner.nextInt();
        scanner.nextLine();

        Time time2 = new Time(h,m,s);

        System.out.println("Az első időpont " + time1.toString() + " = " +
                time1.getInMinutes() + " perc");
        System.out.println("Az második időpont " + time2.toString() + " = " +
                time2.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második: " + time1.earlierThan(time2));
    }
}
