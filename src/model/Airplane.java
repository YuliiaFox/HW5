package model;

public abstract class Airplane implements Comparable<Airplane> {
    private double rangeOfFlight;

    public Airplane(double rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public double getRangeOfFlight() {
        return rangeOfFlight;
    }

    @Override
    public int compareTo(Airplane airplane) {
        return Double.compare(this.rangeOfFlight, airplane.rangeOfFlight);
    }
}
