package JavaFundamental.ExpectionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    public static void Readfile() throws IOException{
        FileReader rb = new FileReader("/Users/sambitmishra/Documents/Java & Selenium scripting/Scripting_Java_Selenium/src/Text.tx");
    }
    public static void main(String[] args) throws IOException {
        Readfile();
        System.out.println("Read the file:");
    }
}
