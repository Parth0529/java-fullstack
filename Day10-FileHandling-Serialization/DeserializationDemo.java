import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("student.ser"))) {

            SerializableStudent s =
                    (SerializableStudent) ois.readObject();

            System.out.println("Name: " + s.name);
            System.out.println("Roll: " + s.roll);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
