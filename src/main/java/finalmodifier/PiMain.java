package finalmodifier;

public class PiMain {

    public static void main(String[] args) {

        System.out.println(CircleCalculator.PI);

        CylinderCalculator cc = new CylinderCalculator();
        double area = cc.calculateSurfaceArea(15, 10);
        double volume = cc.calculateVolume(15, 10);
        System.out.println(area);
        System.out.println(volume);

        double perimeter = new CircleCalculator().calculatePerimeter(10);
        double circleArea = new CircleCalculator().calculateArea(15);
        System.out.println(perimeter);
        System.out.println(circleArea);

    }
}
