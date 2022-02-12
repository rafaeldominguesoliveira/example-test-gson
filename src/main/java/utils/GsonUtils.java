package utils;

import com.google.gson.Gson;
import dtos.Order;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class GsonUtils {

    @SneakyThrows
    public static Order loadJsonFromFile(File file) {
        Reader reader = new FileReader(file);
        Gson gson = new Gson();
        return gson.fromJson(reader, Order.class);
    }
}
