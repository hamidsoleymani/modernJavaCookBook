package two;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static two.First.*;
import static two.First.Color.GREEN;
import static two.First.Color.RED;

class FirstTest {
   static List<Apple> apples;

    @BeforeAll
    public static void setUp(){
       apples = Arrays.asList(new Apple().setColor(GREEN).setWeight(160), new Apple().setColor(GREEN).setWeight(148),
                new Apple().setColor(RED).setWeight(198));
    }

    @Test
    public void test1(){
        List<Apple> applesFiltered = filterGreenApples(apples);
        assertEquals(2, applesFiltered.size());
    }

    @Test
    public void test2(){

        List<Apple> applesFilteredRed = filterApplesByColor(apples, RED);
        assertEquals(1, applesFilteredRed.size());

        List<Apple> applesFilteredGreen = filterApplesByColor(apples, GREEN);
        assertEquals(2, applesFilteredGreen.size());

    }

    @Test
    public void test3(){

        List<Apple> applesFilteredMoreThan150= filterApplesByWeight(apples, 150);
        assertEquals(2, applesFilteredMoreThan150.size());
        List<Apple> redAndHeavyApples =
                filterApples(applesFilteredMoreThan150, new AppleRedAndHeavyPredicate());
    }

    @Test
    public void test4(){

        applePrint(apples, new HeavyOrLightPrinter());
        applePrint(apples, new WeightPrinter());
    }


}
