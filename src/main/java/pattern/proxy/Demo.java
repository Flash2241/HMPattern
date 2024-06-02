package pattern.proxy;

public class Demo {
    public static void main(String[] args) {
        DatabaseConnection databaseProxy = new DatabaseProxy("Cars", "localhost", 15432);
        System.out.println(databaseProxy.connect());
    }
}
