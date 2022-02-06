import dataproviders.DataProviderClass;
import dtos.Client;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dtos.Order;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;

import static utils.GsonUtils.loadJsonFromFile;

public class GsonTest {

    @Test
    public void convertJsonFromJava() {
        String json = "{\n" +
                "\tid : 1,\n" +
                "\tname : \"Rafael\",\n" +
                "\temail : \"rafael@email.com\"\n" +
                "}";
        Gson gson = new Gson();
        Client client = gson.fromJson(json, Client.class);
        System.out.println(client.getId());
        System.out.println(client.getName());
        System.out.println(client.getEmail());
    }

    @Test
    public void convertJavaFromJson() {
        Client client = Client.builder().id(2).name("Gabriel").email("gabriel@email.com").build();
        Gson gson = new Gson();
        String json = gson.toJson(client);
        System.out.println(json);
    }

    @Test
    public void convertJsonFromJavaList() {
        String json = "[ \"rafael@email.com\" , \"teste@teste.com\" , \"gabriel@email.com\" ]";

        Gson gson = new Gson();

        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        ArrayList<String> list = gson.fromJson(json, type);

        System.out.println(list.get(1));
    }

    @Test
    public void convertJavaListFromJson() {
        ArrayList<Client> clients = new ArrayList<Client>();
        Client newClient = Client.builder().id(3).name("New Client").email("newclient@email.com").build();
        clients.add(newClient);

        newClient = Client.builder().id(4).name("New Client 2").email("newclient2@email.com").build();
        clients.add(newClient);

        Gson gson = new Gson();
        String json = gson.toJson(clients);

        System.out.println(json);
    }

    @Test(dataProvider = "orders", dataProviderClass = DataProviderClass.class)
    public void convertJsonFileFromJava(String file) {
        File filePath = new File(file);
        Order order = loadJsonFromFile(filePath);
        System.out.println(order.toString());
    }
}
