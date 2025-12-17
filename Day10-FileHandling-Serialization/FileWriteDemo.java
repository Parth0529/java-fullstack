import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("data.txt")) {
            fw.write("Hello Parth, welcome to Java File Handling!");
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}