package pattern.proxy;

public class DatabaseProxy implements DatabaseConnection {
    private Database database;
    private String host;
    private int port;

    public DatabaseProxy(String databaseName, String host, int port) {
        this.database = new Database(databaseName);
        this.host = host;
        this.port = port;
    }

    @Override
    public String getDatabaseName() {
        return database.getDatabaseName();
    }

    @Override
    public String connect() {
        return "Подключено " + host + ":" + port + "/" + database.getDatabaseName();
    }

}
