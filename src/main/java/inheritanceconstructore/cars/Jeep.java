package inheritanceconstructore.cars;

public class Jeep extends Car{

    private double extraCapacity;
    private double extraFuel;

    private boolean isEnoughFuel(int km) {
        return super.getFuelRate() / 100.0 * km < extraCapacity;
    }

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    public void modifyFuelAmount(double fuel) {
        if (fuel <= extraFuel) {
            extraFuel -= fuel;
        }
    }

    public void drive(int km) {
        if (isEnoughFuel(km)) {
            double consumption = super.getFuelRate() / 100.0 * km;
            extraFuel -= consumption;
            if (extraFuel < 0) {
                super.modifyFuelAmount(extraFuel);
                extraFuel = 0;
            }
        } else {
            throw new RuntimeException("Not enough fuel available!");
        }
    }// csökkenti az üzemanyag mennyiségét, nem fogyhat ki!

    public double calculateRefillAmount() {
        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);
    }//kiszámolja, mennyit lehet tankolni
}
