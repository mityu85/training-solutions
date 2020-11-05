package finalmodifier;

public class CylinderCalculatorBasedOnCircle {


    public double calculatePerimeter(double r) {
        return 2 * r * CircleCalculator.PI;
    }

    public double calculateArea(double r) {
        return r * r * CircleCalculator.PI;
    }
}
