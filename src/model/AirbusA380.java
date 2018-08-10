package model;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AirbusA380 extends CivilAirplane {
    private static InitParams initParams;

    public AirbusA380() {
        super(initParams.getRangeOfFlight(), initParams.getCapacity(), initParams.getCarryingCapacity());
    }

    static {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get("src/model/initParamsAirbusA380.json")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        initParams = new Gson().fromJson(data, InitParams.class);
    }
}
