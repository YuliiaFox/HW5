package model;


import com.google.gson.annotations.SerializedName;

public class InitParams {
    @SerializedName("rangeOfFlight")
    private double rangeOfFlight;
    @SerializedName("capacity")
    private double capacity;
    @SerializedName("carryingCapacity")
    private double carryingCapacity;

    public double getRangeOfFlight() {
        return rangeOfFlight;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }
}
