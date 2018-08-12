package model;

public class AirplaneFactory {
    public static CivilAirplane createBoeing777() {
        return new Boeing777();
    }

    public static CivilAirplane createAirbusA380() {
        return new AirbusA380();
    }
}
