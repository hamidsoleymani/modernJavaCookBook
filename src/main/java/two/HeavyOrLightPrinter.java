package two;

public class HeavyOrLightPrinter implements ApplePrinter {
    @Override
    public void prettyPrintApple(Apple apple) {
        if (apple.getWeight() > 150) {
            System.out.println("This Apple is a Heavy apple");
        } else {
            System.out.println("This Apple is a light apple");
        }
    }
}
