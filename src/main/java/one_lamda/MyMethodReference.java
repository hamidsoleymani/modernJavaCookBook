package one_lamda;


import java.util.Arrays;
import java.util.List;

public class MyMethodReference {
    List<String> messages = Arrays.asList("hello", "baeldung", "readers!");

    public void out() {
       // System.out.print(messages.forEach(StringUtils::capitalize));
    }

    public static void main(String[] args) {
        new MyMethodReference().out();
    }
}
