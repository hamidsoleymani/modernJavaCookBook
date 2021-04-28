package three;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestMyConsumerTest {
    @Test
    public void test() {
        TestMyConsumer myConsumer = new TestMyConsumer();
        myConsumer.it(Arrays.asList("a3", "al"), new MyConsumerI());
        myConsumer.it(Arrays.asList("a3", "al"), c -> System.out.println(c));
    }
}
