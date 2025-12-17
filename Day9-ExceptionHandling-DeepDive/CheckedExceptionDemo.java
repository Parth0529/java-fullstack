import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
            fr.read();
        } catch (IOException e) {
            System.out.println("Checked exception handled: " + e.getMessage());
        }
    }
}
