package three;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestProcessorsTest {

    @Test
    public void testOne() throws IOException {
        OnelineProcessor one = new OnelineProcessor();
        assertEquals("one", TestProcessors.process(one));
        assertEquals("one", TestProcessors.process(b -> b.readLine()));


        TwolineProcessor two = new TwolineProcessor();
        assertEquals("onetwo", TestProcessors.process(two));
        assertEquals("onetwothree", TestProcessors.process(b -> b.readLine() + b.readLine() + b.readLine()));

    }

}
