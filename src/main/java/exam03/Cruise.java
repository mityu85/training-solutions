package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger) {
        if (boat.getMaxPassengers() <= passengers.size()) {
            throw new IllegalArgumentException();
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger) {
        double sum = passenger.getCruiseClass().getValues();
        return sum * basicPrice;
    }

    public Passenger findPassengerByName(String name) {
        Passenger p = null;
        for (Passenger passenger: passengers) {
            if (passenger.getName().equals(name)) {
                p = passenger;
            }
        }
        return p;
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> orderedList = new ArrayList<>();
        for (Passenger passenger: passengers) {
            orderedList.add(passenger.getName());
        }
        Collections.sort(orderedList);
        return orderedList;
    }

    public double sumAllBookingsCharged() {
        double sum = 0.0;
        for (Passenger passenger: passengers) {
            sum += passenger.getCruiseClass().getValues() * basicPrice;
        }
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> map = new LinkedHashMap<>();
        Integer sum = 1;
        for (Passenger passenger: passengers) {
            if (map.containsKey(passenger.getCruiseClass())) {
                sum = map.get(passenger.getCruiseClass())+1;
            }
            map.put(passenger.getCruiseClass(), sum);
            sum = 1;
        }
        return map;
    }
}
