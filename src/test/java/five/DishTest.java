package five;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DishTest {

    List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH));

    List<Dish> specialMenu = Arrays.asList(
            new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER));

    @Test
    public void test1() {

        List<Dish> veggieList = menu.stream().filter(m -> m.isVegetarian()).collect(toList());
        assertEquals(4, veggieList.size());
        List<Dish> veggieListMethodReference = menu.stream().filter(Dish::isVegetarian).collect(toList());
        assertEquals(4, veggieListMethodReference.size());
    }

    @Test
    public void test2() {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        List<Integer> evenNumbersNoDublicate = numbers.stream().filter(n -> {
            System.out.println(n);
            return n % 2 == 0;
        }).distinct().collect(toList());
        assertEquals(2, evenNumbersNoDublicate.size());
    }

    @Test
    public void test3() {
        List<Dish> dishesLessthan320Calories = specialMenu.stream().filter(d -> {
            System.out.println(d);
            return d.getCalories() < 320;
        }).collect(toList());
        assertEquals(2, dishesLessthan320Calories.size());
        System.out.println(dishesLessthan320Calories.toString());
        System.out.println("----");

        List<Dish> dishesLessthan320Calories2 = specialMenu.stream()
                .takeWhile(d -> {
                    System.out.println(d);
                    return d.getCalories() < 320;
                }).collect(toList());
        assertEquals(2, dishesLessthan320Calories2.size());
        System.out.println(dishesLessthan320Calories2.toString());
        System.out.println("----");
        List<Dish> slicedMenu2
                = specialMenu.stream()
                .dropWhile(dish -> {
                    System.out.println(dish);
                    return dish.getCalories() < 320;
                })
                .collect(toList());
        assertEquals(3, slicedMenu2.size());
        System.out.println(slicedMenu2.toString());

    }

    @Test
    public void test4() {
        List<Dish> meat = menu.stream().filter(m -> m.getType().equals(Dish.Type.MEAT)).limit(2).collect(Collectors.toList());
        assertEquals(2, meat.size());

    }

    @Test
    public void test5() {
        List<String> names = menu.stream().map(m -> m.getName()).collect(toList());
        List<String> names2 = menu.stream().map(Dish::getName).collect(toList());
        assertEquals(9, names.size());
        System.out.println(names);

    }

}
