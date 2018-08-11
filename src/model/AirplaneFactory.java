package model;

public class AirplaneFactory {
    public static Airplane createBoeing777() {
        return new Boeing777();
    }

    public static Airplane createAirbusA380() {
        return new AirbusA380();
    }
}
