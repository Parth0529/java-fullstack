package service;

import model.Student;

public class StudentService {

    public void printStudent(Student s) {
        System.out.println("Name: " + s.getName());
        System.out.println("Roll: " + s.getRoll());
    }
}
