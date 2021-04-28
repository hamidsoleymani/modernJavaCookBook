package one_lamda;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class MyTestFilenameFilter {


    public static void main(String[] args) {
        FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.contains("Test");
            }
        };

        FilenameFilter filenameFilter1 = (File dir, String name) -> {return name.contains("Test");};
        File directory = new File("/Users/hamidsoleymani/IdeaProjects/private/java/modernJavaCookBook/src/main/java/one_lamda");
        String[] list = directory.list(filenameFilter);
        System.out.println(Arrays.asList(list));
        directory.list(filenameFilter1);
        directory.list((dir, name)-> name.endsWith(""));
    }
}
