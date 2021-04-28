package three;

import java.util.List;

public class TestMyConsumer {

    public void it(List<Object> list, MyConsumer myConsumer) {
        for (Object o : list) {
            myConsumer.accept(o);
        }
    }
}
