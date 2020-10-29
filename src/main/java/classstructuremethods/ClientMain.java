package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("John Doe");
        client.setYear(1980);
        client.setAddress("8801 Jackrabbit RD. Cheyenne, WY");

        System.out.println("Name: " + client.getName() + "\n" +
                "Year of birth: " + client.getYear() + "\n" +
                "Address: " + client.getAddress());

        client.migrate("29 Rose Str. Budapest, HU");
        System.out.println("The address has been changed to the following:\n" + client.getAddress());
    }
}
