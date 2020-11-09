package numbers;

public class Circle {

    private int diameter;
    private final double PI = 3.14;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public float getDiameter() {
        return diameter;
    }

    public double getPI() {
        return PI;
    }

    public float perimeter() {
        return (float) (2 * PI * diameter / 2.0);
    }

    public float area() {
        float d = (float) (diameter / 2.0);
        return (float) (PI * d * d);
    }
}
