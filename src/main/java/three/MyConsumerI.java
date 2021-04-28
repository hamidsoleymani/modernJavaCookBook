package three;

public class MyConsumerI implements MyConsumer {
    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}
