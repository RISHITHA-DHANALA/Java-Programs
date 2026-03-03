import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello, this is a Java file handling example.");
            fw.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
