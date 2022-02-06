package gson;

import dataproviders.DataProviderClass;
import dtos.Customer;
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
        Customer client = gson.fromJson(json, Customer.class);
        System.out.println(client.getId());
        System.out.println(client.getName());
        System.out.println(client.getEmail());
    }

    @Test
    public void convertJavaFromJson() {
        Customer customer = new Customer();
        customer.setId(2);
        customer.setName("Gabriel");
        customer.setEmail("gabriel@email.com");

        Gson gson = new Gson();
        String json = gson.toJson(customer);
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
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setId(3);
        customer.setName("New Customer");
        customer.setEmail("newcustomer@email.com");
        customers.add(customer);

        customer = new Customer();
        customer.setId(4);
        customer.setName("New Customer 2");
        customer.setEmail("newcustomer2@email.com");
        customers.add(customer);

        Gson gson = new Gson();
        String json = gson.toJson(customers);

        System.out.println(json);
    }

    @Test(dataProvider = "orders", dataProviderClass = DataProviderClass.class)
    public void convertJsonFileFromJava(String file) {
        File filePath = new File(file);
        Order order = loadJsonFromFile(filePath);
        System.out.println(order.toString());
    }
}
