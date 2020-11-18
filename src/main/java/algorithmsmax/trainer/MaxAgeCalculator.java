package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer trainerWithMaxAge(List<Trainer> trainers) {

        Trainer maxAge = null;
        for (Trainer trainer: trainers) {
            if (maxAge == null || trainer.getAge() > maxAge.getAge()) {
                maxAge = trainer;
            }
        }
        return maxAge;
    }
}
