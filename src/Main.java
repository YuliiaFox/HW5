import model.Airline;
import model.Boeing777;
import model.CivilAirplane;
import view.View;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws InvalidItemMenuException {
        Airline airline = new Airline(4, 5);

        View.showMenu();
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case View.CALCCAPACITY:
                View.showCalcCapacityResult(airline.calcTotalCapacity(), airline.calcTotalCarryingCapacity());
                break;

            case View.SORTAIRPLANES:
                View.showSortedAirplaneList(airline.sortAirplane());
                break;

            case View.FINDAIRPLANE:
                View.askForParams();
                double rangeOfFlight = scanner.nextDouble();
                double capacity = scanner.nextDouble();
                double carryingCapacity = scanner.nextDouble();
                View.showFoundAirplanes(airline.findAirplane(rangeOfFlight, capacity, carryingCapacity));
                break;
            default:
                try {
                    
                }
                catch (InvalidItemMenuException e){
                    throw new InvalidItemMenuException("Invalid menu number", e);
                }

        }

    }
}

