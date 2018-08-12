package model;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Initializer {

    public static InitParams init(String pathToJson) {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(pathToJson)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Gson().fromJson(data, InitParams.class);
    }
}
