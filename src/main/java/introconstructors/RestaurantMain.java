package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Art Pub", 10);
        restaurant.setMealsOnMenu("Vegetable stew");
        restaurant.setMealsOnMenu("Goulash");
        restaurant.setMealsOnMenu("Steak");

        System.out.println(restaurant.getName());
        System.out.println(restaurant.getCapacity());
        System.out.println(restaurant.getMenu());
    }
}
