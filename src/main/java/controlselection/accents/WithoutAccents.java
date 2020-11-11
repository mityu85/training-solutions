package controlselection.accents;

public class WithoutAccents {

    public char accents(char c) {

        char result;
        switch (c) {
            case 'á':
                result = 'a';
                break;
            case 'é':
                result = 'e';
                break;
            case 'í':
                result = 'i';
                break;
            case 'ó':
                result = 'o';
                break;
            case 'ő':
                result = 'ö';
                break;
            case 'ű':
                result = 'ü';
                break;
            default:
                result = c;
        }
        return result;
    }

    public static void main(String[] args) {

        WithoutAccents withoutAccents = new WithoutAccents();
        System.out.println(withoutAccents.accents('á'));
        System.out.println(withoutAccents.accents('ű'));
        System.out.println(withoutAccents.accents('ö'));
        System.out.println(withoutAccents.accents('e'));
    }
}
