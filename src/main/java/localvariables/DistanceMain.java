package localvariables;

public class DistanceMain {
    public static void main(String[] args) {

        Distance distance = new Distance(15.23, false);
        System.out.println("Distance: " + distance.getDistanceInKm() + " - " + distance.isExact());

        int value = (int) distance.getDistanceInKm();
        System.out.println(value);
    }
}
