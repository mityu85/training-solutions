package week02;

import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    private Office office;

    public void readOffice() {
        int count;
        office = new Office();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many meeting rooms would like to create?");
        count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("What should be the name of the meeting room?");
            String name = scanner.nextLine();

            System.out.println("How long the width of the meeting room in meter?");
            int width = scanner.nextInt();
            scanner.nextLine();

            System.out.println("How long the length of the meeting room in meter?");
            int length = scanner.nextInt();
            scanner.nextLine();

            office.addMeetingRoom(new MeetingRoom(name, length, width));
        }
    }

    public String printMenu() {
        return "1. Tárgyalók sorrendben\n" +
            "2. Tárgyalók visszafele sorrendben\n" +
            "3. Minden második tárgyaló\n" +
            "4. Területek\n" +
            "5. Keresés pontos név alapján\n" +
            "6. Keresés névtöredék alapján\n" +
            "7. Keresés terület alapján\n";
    }

    public void runMenu() {
        for (;;) {

            System.out.println("Choose a number!");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num == 1) {
                System.out.println(office.printNames());
            } else {
                if (num == 2) {
                    System.out.println(office.printNamesReverse());
                } else {
                    if (num == 3) {
                        System.out.println(office.printEventName());
                    } else {
                        if (num == 4) {
                            office.printAreas();
                        } else {
                            if (num == 5) {
                                System.out.println("Add a name!");
                                String name = scanner.nextLine();
                                System.out.println(office.printMeetingRoomsWithName(name));
                            } else {
                                if (num == 6) {
                                    System.out.println("Add a part of name!");
                                    String partOfName = scanner.nextLine();
                                    System.out.println(office.printMeetingRoomsContains(partOfName));
                                } else {
                                    if (num == 7) {
                                        System.out.println("Add the area!");
                                        int area = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println(office.printAreasLargerThan(area));
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        System.out.println(controller.printMenu());
        controller.runMenu();
    }
}
