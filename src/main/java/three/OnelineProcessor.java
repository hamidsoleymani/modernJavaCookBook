package three;

import java.io.BufferedReader;
import java.io.IOException;

 public class OnelineProcessor implements BufferedReaderProcessor {
     @Override
     public String process(BufferedReader b) throws IOException {
         return b.readLine();
     }

 }
