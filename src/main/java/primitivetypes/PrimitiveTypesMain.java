package primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

        PrimitiveTypes primitiveTypes = new PrimitiveTypes();

        primitiveTypes.toBinaryString(7);
        System.out.println();
        System.out.println(Integer.toBinaryString(7));
        System.out.println(new Integer(1) + new Integer(2));
    }
}
