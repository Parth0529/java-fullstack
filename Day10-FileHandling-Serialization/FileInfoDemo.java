import java.io.File;

public class FileInfoDemo {
    public static void main(String[] args) {
        File f = new File("data.txt");

        System.out.println("Exists: " + f.exists());
        System.out.println("Name: " + f.getName());
        System.out.println("Path: " + f.getAbsolutePath());
        System.out.println("Readable: " + f.canRead());
        System.out.println("Writable: " + f.canWrite());
    }
}