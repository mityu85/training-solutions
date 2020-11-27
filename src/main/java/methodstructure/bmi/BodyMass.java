package methodstructure.bmi;

import week05d04.Currency;

public class BodyMass {

    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double bodyMassIndex() {

        return weight / (height * height);
    }

    public BmiCategory body() {
        BmiCategory bmiCategory = null;
        if (bodyMassIndex() < 18.5) {
            bmiCategory = BmiCategory.UNDERWEIGHT;
        }
        if (bodyMassIndex() >= 18.5 && bodyMassIndex() <= 25) {
            bmiCategory = BmiCategory.NORMAL;
        }
        if (bodyMassIndex() > 25) {
            bmiCategory = BmiCategory.OVERWEIGHT;
        }
        return bmiCategory;
    }

    public boolean isThinnerThan(BodyMass bmi) {
        return this.bodyMassIndex() < bmi.bodyMassIndex();
    }
}
