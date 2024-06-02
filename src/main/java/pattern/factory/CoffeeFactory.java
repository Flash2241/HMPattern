package pattern.factory;

public class CoffeeFactory {
    public static Coffee createCoffee(String type) {

        switch (type) {
            case "espresso":
                return new Espresso();
            case "americano":
                return new Americano();
            default:
                return null;
        }
    }
}
