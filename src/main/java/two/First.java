package two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static two.First.Color.GREEN;
import static two.First.Color.RED;


public class First {
    public enum Color {RED, GREEN}

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Apple> apples = Arrays.asList(new Apple().setColor(GREEN), new Apple().setColor(GREEN), new Apple().setColor(RED));
        List<Apple> applesFiltered = filterGreenApples(apples);
    }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory,
                                                   int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void applePrint(List<Apple> inventory, ApplePrinter applePrinter) {
        for (Apple apple : inventory) {
            applePrinter.prettyPrintApple(apple);
        }
    }
}

