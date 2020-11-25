package week05d03;

import java.util.ArrayList;
import java.util.List;

public class UserValidator {

    public void validate(List<User> users) {
        users = new ArrayList<>(users);
        for (User user: users) {
            if (user.getName() == null || user.getName().isEmpty()) {
                throw new IllegalArgumentException("The username is empty!");
            }
            if (user.getAge() < 0 || user.getAge() > 120) {
                throw new IllegalArgumentException("The user's age is not between 0 and 120!");
            }
        }
    }
}
