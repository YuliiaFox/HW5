package model;

public abstract class CivilAirplane extends Airplane {
    private double capacity;
    private double carryingCapacity;

    public CivilAirplane(double rangeOfFlight, double capacity, double carryingCapacity) {
        super(rangeOfFlight);
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

}
