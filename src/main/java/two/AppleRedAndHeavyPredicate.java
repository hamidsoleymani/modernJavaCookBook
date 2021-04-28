package two;

import static two.First.Color.RED;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return RED.equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
