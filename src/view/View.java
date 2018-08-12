package view;

import model.Airline;
import model.CivilAirplane;

import java.util.List;

public class View {
    public static final int CALCCAPACITY = 1;
    public static final int SORTAIRPLANES = 2;
    public static final int FINDAIRPLANE = 3;

    public static void showMenu() {
        System.out.println("1.Count capacity and carrying capacity ");
        System.out.println("2.Sort airplanes by range of flight");
        System.out.println("3.Find airplane by parameters");
        System.out.println("Enter menu number:");
    }

    public static void askToContinuation() {
        System.out.println("Do you want to continue? Y/N");
    }

    public static void showCalcCapacityResult(double capacity, double carryingCapacity) {
        System.out.println("Total capacity: " + capacity);
        System.out.println("Total carrying capacity: " + carryingCapacity);
    }

    public static void showSortedAirplaneList(List<CivilAirplane> airplaneList) {
        for (CivilAirplane airplane : airplaneList) {
            System.out.println(airplane.toString());
        }
    }

    public static void showAirplanesNotFound() {
        System.out.println("Airplanes with such parameters were not found");
    }

    public static void askForParams() {
        System.out.println("Enter range of flight, capacity and carrying capacity:");
    }

    public static void showFoundAirplanes(List<CivilAirplane> foundAirplane) {
        System.out.println("Found airplanes:");
        for (CivilAirplane civilAirplane : foundAirplane) {
            System.out.println(civilAirplane.toString());
        }
    }
}
