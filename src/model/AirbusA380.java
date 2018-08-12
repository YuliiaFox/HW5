package model;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static model.Boeing777.INIT_PARAMS_JSON;

public class AirbusA380 extends CivilAirplane {
    private static InitParams initParams;
    public static final String INIT_PARAMS_JSON = "src/model/initParamsAirbusA380.json";


    public AirbusA380() {
        super(initParams.getRangeOfFlight(), initParams.getCapacity(), initParams.getCarryingCapacity());
    }

    static {
        initParams = Initializer.init(INIT_PARAMS_JSON);
    }
}
