package model;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Boeing777 extends CivilAirplane {
    private static InitParams initParams;
    public static final String INIT_PARAMS_JSON = "src/model/initParamsBoeing777.json";

    public Boeing777() {
        super(initParams.getRangeOfFlight(), initParams.getCapacity(), initParams.getCarryingCapacity());
    }

    static {
        initParams = Initializer.init(INIT_PARAMS_JSON);
    }
}


