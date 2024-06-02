package pattern.proxy;

public interface DatabaseConnection {
    String getDatabaseName();

    String connect();
}

