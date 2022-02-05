package dataproviders;

import org.testng.annotations.DataProvider;
import static enums.FilePathEnum.*;

public class DataProviderClass {

    @DataProvider(name="orders")
    public Object[][] getOrders() {
        return new Object[][]
                {
                        {ORDERS_FILEPATH.getFilePath()}
                };

    }

}
