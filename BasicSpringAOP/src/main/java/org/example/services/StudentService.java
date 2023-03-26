package org.example.services;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    void addStudent(Student student);
    void removeStudent(Student student);
}
