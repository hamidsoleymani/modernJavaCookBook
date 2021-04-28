package two;

public class WeightPrinter implements ApplePrinter {
    private Apple apple;

    @Override
    public void prettyPrintApple(Apple apple) {
        this.apple = apple;
        System.out.println("weight: " + apple.getWeight());

    }

    public String toString() {
        return "weight: " + this.apple.getWeight();
    }
}
