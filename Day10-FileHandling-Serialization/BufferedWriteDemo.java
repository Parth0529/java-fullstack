import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteDemo {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"))) {
            bw.write("Buffered writing is faster!");
            bw.newLine();
            bw.write("Used in real applications.");
            System.out.println("Buffered data written.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}