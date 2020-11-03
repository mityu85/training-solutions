package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        int boat1 = 5;
        int boat2 = 3;
        int boat3 = 2;

        System.out.println("How many people want to go?");
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();

        if (people > 10) {
            System.out.println("All of the boats have been rented. " + (people - 10) + " people are waiting on the coast.");
        } else {
            if (people > 8) {
                System.out.println("All of the boats have been rented.");
            } else {
                if (people > 5 && people < 8) {
                    System.out.println("Boat(5) and Boat(2) were rented. 3 people can go.");
                } else {
                    if (people == 8) {
                        System.out.println("Boat(5) and Boat(3) were rented. 2 people can go.");
                    } else {
                        if (people == 5) {
                            System.out.println("Boat(5) was rented. 5 people can go.");
                        } else {
                            if (people < 5 && people > 3) {
                                System.out.println("Boat(3) and Boat(2) were rented. 5 people can go.");
                            } else {
                                if (people == 3) {
                                    System.out.println("Boat(3) was rented. 7 people can go.");
                                } else {
                                    if (people < 3 && people > 0) {
                                        System.out.println("Boat(2) was rented. 8 people can go.");
                                    } else {
                                        System.out.println("Nobody here! 10 people can go.");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
