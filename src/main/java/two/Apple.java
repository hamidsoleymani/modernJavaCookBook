package two;

import java.util.Random;

public class Apple {
    private int id;
    private First.Color color;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public Apple setWeight(double weight) {
        this.weight = weight;
        return this;
    }



    Apple(){
        Random random = new Random();
        id = random.nextInt(1000);
    }

    public First.Color getColor() {
        return color;
    }

    public Apple setColor(First.Color color) {
        this.color = color;
        return this;
    }
}
