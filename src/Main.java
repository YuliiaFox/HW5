import model.Airline;
import model.Airplane;
import model.CivilAirplane;
import view.View;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidItemMenuException {

        Scanner scanner = new Scanner(System.in);
        String userAnswer;

        do {
            Airline airline = new Airline(4, 5);

            View.showMenu();
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
                    List<CivilAirplane> foundAirplane = airline.findAirplane(rangeOfFlight, capacity, carryingCapacity);
                    if (foundAirplane.isEmpty()) {
                        View.showAirplanesNotFound();
                    } else {
                        View.showFoundAirplanes(foundAirplane);
                    }
                    break;

                default:
                    throw new InvalidItemMenuException("Invalid menu number");

            }

            View.askToContinuation();
            userAnswer = scanner.next();

        } while (userAnswer.equalsIgnoreCase("Y"));

    }
}

