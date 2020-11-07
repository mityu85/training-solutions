package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<String> menu = new ArrayList<>();
    private String name;
    private int capacity;
    private final int FOUR = 4;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        capacity = numberOfTables * FOUR;
    }

    public void setMealsOnMenu(String meals) {
        menu.add(meals);
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
