package model;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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

    @Override
    public String toString() {
        return "{ " + this.getClass().getSimpleName() +
                ", rangeOfFlight=" + getRangeOfFlight() +
                ", capacity=" + capacity +
                ", carryingCapacity=" + carryingCapacity +
                '}';
    }


}
