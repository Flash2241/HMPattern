package pattern.factory;

public class Espresso implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing Espresso");
    }

}
