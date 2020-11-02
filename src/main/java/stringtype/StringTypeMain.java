package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message += 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String d = "" + "";
        System.out.println(d.length());

        d = "Abcde";
        d.length();
        System.out.println(d.substring(0, 1) + ", " + d.substring(2, 3));
        System.out.println(d.substring(0, 3));
    }
}
