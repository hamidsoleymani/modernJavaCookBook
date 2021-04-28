package three;

import java.io.BufferedReader;
import java.io.IOException;

class TwolineProcessor implements BufferedReaderProcessor {

        @Override
        public String process(BufferedReader b) throws IOException {
            return b.readLine() + b.readLine();
        }

}
