package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Airline {
    private int numOfBoeing777;
    private int numOfAirbusA380;
    private List<CivilAirplane> airplaneList = new ArrayList<>();

    public Airline(int numOfBoeing777, int numOfAirbusA380) {
        this.numOfBoeing777 = numOfBoeing777;
        this.numOfAirbusA380 = numOfAirbusA380;
        initAirplanes();
    }

    private void initAirplanes() {
        for (int i = 0; i < numOfAirbusA380; i++) {
            airplaneList.add(AirplaneFactory.createAirbusA380());
        }
        for (int i = 0; i < numOfBoeing777; i++) {
            airplaneList.add(AirplaneFactory.createBoeing777());
        }
    }

    public List<CivilAirplane> sortAirplane() {
        Collections.sort(airplaneList);
        return airplaneList;
    }

    public double calcTotalCapacity() {
        double totalCapacity = 0;
        for (CivilAirplane civilAirplane : airplaneList) {
            totalCapacity += civilAirplane.getCapacity();
        }
        return totalCapacity;
    }

    public double calcTotalCarryingCapacity() {
        double totalCarryingCapacity = 0;
        for (CivilAirplane civilAirplane : airplaneList) {
            totalCarryingCapacity += civilAirplane.getCarryingCapacity();
        }
        return totalCarryingCapacity;
    }

    public List<CivilAirplane> findAirplane(double rangeOfFlight, double capacity, double carryingCapacity) {
        List<CivilAirplane> foundAirplanes = new ArrayList<>();
        for (CivilAirplane civilAirplane : airplaneList) {
            if (civilAirplane.getCapacity() == capacity && civilAirplane.getCarryingCapacity() == carryingCapacity &&
                    civilAirplane.getRangeOfFlight() == rangeOfFlight) {
                foundAirplanes.add(civilAirplane);
            }
        }
        return foundAirplanes;
    }

    public List<CivilAirplane> getAirplaneList() {
        return airplaneList;
    }
}
