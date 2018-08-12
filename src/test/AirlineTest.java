package test;

import model.AirbusA380;
import model.Airline;
import model.Boeing777;
import model.CivilAirplane;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class AirlineTest {
    @Test
    public void testInitAirplanes() {
        int numOfBoeing777 = 1;
        int numOfAirbusA380 = 1;
        Airline airline = new Airline(numOfBoeing777, numOfAirbusA380);

        int actualNumOfBoeings = 0;
        int actualNumbOfAirbuses = 0;
        for (CivilAirplane civilAirplane : airline.getAirplaneList()) {

            if (civilAirplane instanceof Boeing777) {
                actualNumOfBoeings++;
            }
            if (civilAirplane instanceof AirbusA380) {
                actualNumbOfAirbuses++;
            }
        }
        assertEquals(numOfAirbusA380, actualNumbOfAirbuses);
        assertEquals(numOfBoeing777, actualNumOfBoeings);

    }

    @Test
    public void testCalcTotalCapacity() {
        int numOfBoeing777 = 1;
        int numOfAirbusA380 = 1;
        Airline airline = new Airline(numOfBoeing777, numOfAirbusA380);
        assertEquals(575000.0 + 103000.0, airline.calcTotalCarryingCapacity());
    }

    @Test
    public void testCalcCapacity() {
        int numOfBoeing777 = 1;
        int numOfAirbusA380 = 1;
        Airline airline = new Airline(numOfBoeing777, numOfAirbusA380);
        assertEquals(550.0 + 853.0, airline.calcTotalCapacity());
    }
    @Test
    public void testFindAirplanesSuccess(){
        int numOfBoeing777 = 1;
        int numOfAirbusA380 = 0;
        Airline airline = new Airline(numOfBoeing777,numOfAirbusA380);

        double rangeOfFlight = 9100.0;
        double capacity = 550.0;
        double carryingCapacity = 103000.0;
        List<CivilAirplane> foundAirplane = airline.findAirplane(rangeOfFlight,capacity,carryingCapacity);
        assertEquals(1,foundAirplane.size());

        CivilAirplane airplane = foundAirplane.get(0);
        assertEquals(rangeOfFlight, airplane.getRangeOfFlight());
        assertEquals(capacity, airplane.getCapacity());
        assertEquals(carryingCapacity, airplane.getCarryingCapacity());
    }

}
