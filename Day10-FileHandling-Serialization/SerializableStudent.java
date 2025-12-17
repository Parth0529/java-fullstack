import java.io.Serializable;

public class SerializableStudent implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int roll;

    public SerializableStudent(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}