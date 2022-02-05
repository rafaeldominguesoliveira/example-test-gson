package enums;

public enum FilePathEnum {

    ORDERS_FILEPATH("src/test/resources/json_structures/orders.json");

    public final String filePath;

    FilePathEnum(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return this.filePath;
    }

}
