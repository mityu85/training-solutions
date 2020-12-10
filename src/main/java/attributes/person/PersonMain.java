package attributes.person;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person("John Doe", "123456UA");
        Address address = new Address("Colorado", "Denver",
                "8801 JackRabbit RD.", "88209");

        System.out.println(person.getName());
        System.out.println(person.getAddress());
        System.out.println(person.getIdentificationCard());

        person.moveTo(address);
        System.out.println(person.personToString());
        System.out.println(person.getAddress().getStreetAndNumber());

        System.out.println();
        System.out.println(person.getAddress().addressToString());

        System.out.println();
        person.getAddress().correctData("New York", "New York",
                "115 Avenue", "58974");
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        System.out.println();
        System.out.println(address.addressToString());

        System.out.println();
        person.correctData("Jane Doe", "987456AU");
        System.out.println(person.personToString());

    }
}
