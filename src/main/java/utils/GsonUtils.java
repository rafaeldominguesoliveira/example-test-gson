package utils;

import com.google.gson.Gson;
import dtos.Order;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class GsonUtils {

    @SneakyThrows
    public static void loadJson(Class nameClass, File file) {
        Reader reader = new FileReader(file);
        Gson gson = new Gson();
        //Class nameClass = gson.fromJson(reader, nameClass.getClass());
    }
}
