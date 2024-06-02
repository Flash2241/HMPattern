package pattern.factory;

public class Demo {
    public static void main(String[] args) {
        CoffeeFactory.createCoffee("espresso").brew();
    }
}
