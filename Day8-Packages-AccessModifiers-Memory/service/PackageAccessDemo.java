package service;

import model.Student;

public class PackageAccessDemo {
    public static void main(String[] args) {
        Student s = new Student("Parth", 101);
        StudentService service = new StudentService();
        service.printStudent(s);
    }
}
