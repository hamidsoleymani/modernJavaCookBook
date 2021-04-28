package two_function;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class MyFunction {
    public MyFunction() {
    }

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
        for (String s : strings) {
            System.out.println(s);
        }

        Consumer<String> it = new Consumer<String>() {
            public void accept(String value) {
                System.out.println(process(value));
            }
        };
        for (String t : strings) {
            it.accept(t);
        }
        strings.forEach(it);
        Consumer<String> c = (s) -> System.out.println(s);
        Consumer<String> cc = System.out::println;
        IntConsumer intConsumer = new IntConsumer() {
            float percentage = 0.05f;

            @Override
            public void accept(int value) {
                System.out.print(percentage * value);
            }
        };
        percentage(intConsumer);

    }

    public static String process(String s) {
        return s.toUpperCase();
    }

    public static void percentage(IntConsumer intConsumer) {
        intConsumer.accept(3);
    }
}
