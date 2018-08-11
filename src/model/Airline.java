package model;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private int numOfBoeing777;
    private int numOfAirbusA380;
    private List<Airplane> airplaneList = new ArrayList<>();

    public Airline(int numOfBoeing777, int numOfAirbusA380) {
        this.numOfBoeing777 = numOfBoeing777;
        this.numOfAirbusA380 = numOfAirbusA380;
        addAirplane();
    }

    private void addAirplane(){
        for (int i = 0; i < numOfAirbusA380 ; i++) {
            AirplaneFactory.createAirbusA380();
        }
        for (int i = 0; i <numOfBoeing777 ; i++) {
            AirplaneFactory.createBoeing777();
        }
    }


}
