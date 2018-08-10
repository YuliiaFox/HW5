package model;

public abstract class Airplane {
    private double rangeOfFlight;

    public Airplane(double rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public double getRangeOfFlight() {
        return rangeOfFlight;
    }


}
