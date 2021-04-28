package three;

import java.io.*;

public class TestProcessors {


    public static String process(BufferedReaderProcessor p) throws IOException {
        try(BufferedReader br = new BufferedReader(getFileReader())){
            return p.process(br);
        }
    }

    private static FileReader getFileReader() throws FileNotFoundException {
        String fileName = "data.txt";
        ClassLoader classLoader = TestProcessors.class.getClassLoader();

        File file = new File(classLoader.getResource(fileName).getFile());
        FileReader fileReader = new FileReader(file);
        return fileReader;
    }
}
