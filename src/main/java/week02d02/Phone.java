package week02d02;

import java.util.Scanner;

public class Phone {

    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {

        meetingrooms.Phone phone = new meetingrooms.Phone("iPhone", 64);
        System.out.println(phone.getType() + " " + phone.getMem());

        System.out.println("What kind of phone you have?");
        Scanner sc = new Scanner(System.in);
        String phoneType = sc.nextLine();

        System.out.println("How many GB storage there is on your phone?");
        int phoneMem = sc.nextInt();
        meetingrooms.Phone phone1 = new meetingrooms.Phone(phoneType, phoneMem);
        System.out.println(phone1.getType() + " " + phone1.getMem());
    }
}
