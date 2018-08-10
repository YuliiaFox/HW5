package model;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private int numOfAirplane;
    private List<Airplane> airplaneList = new ArrayList<>();

    public Airline(int numOfAirplane) {
        this.numOfAirplane = numOfAirplane;
    }

}
