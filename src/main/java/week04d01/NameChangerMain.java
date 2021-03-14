package week04d01;

public class NameChangerMain {

    public static void main(String[] args) {

       NameChanger nameChanger = new NameChanger("John", "Doe");
       nameChanger.changeFirstName("Jack");
        System.out.println(nameChanger.getFullName());
    }
}
