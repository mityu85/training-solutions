package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {
        Person person1;
        Person person2;
        Person person = new Person("John Doe", 1982);
        person1 = person;
        person2 = person1;
        person2.setName("Jane Doe");

        System.out.println(person1.getName() + ": " + person1.getAge());
        System.out.println(person2.getName() + ": " + person2.getAge());

        int i = 24;
        int j = i;
        j++;
        System.out.println(i + " " + j);

        Person john = new Person("Jack Doe", 1985);
        person1 = john;
        System.out.println(john.getName() + ": " + john.getAge());
        System.out.println(person1.getName() + ": " + person1.getAge());

    }
}
