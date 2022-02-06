package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dtos.Order;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class GsonUtils {

    @SneakyThrows
    public static Order loadJsonFromFile(File file) {
        Reader reader = new FileReader(file);
        Gson gson = new Gson();
        return gson.fromJson(reader, Order.class);
    }

    @SneakyThrows
    public static ArrayList<String> loadJsonFromPayload(String payload) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        return gson.fromJson(payload, type);
    }
}
