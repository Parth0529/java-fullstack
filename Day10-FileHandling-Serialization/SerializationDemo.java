import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        SerializableStudent s =
                new SerializableStudent("Parth", 101);

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("student.ser"))) {

            oos.writeObject(s);
            System.out.println("Object serialized.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}