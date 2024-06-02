package pattern.proxy;

public class Database implements DatabaseConnection {
    private String databaseName;

    public Database(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public String getDatabaseName() {
        return databaseName;
    }

    @Override
    public String connect() {
        return " Подключено " + databaseName;
    }

}
