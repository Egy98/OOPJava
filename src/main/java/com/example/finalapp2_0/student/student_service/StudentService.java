package com.example.finalapp2_0.student.student_service;

import com.example.finalapp2_0.student.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long IdStudent);
    List<Student> getAllStudent();
    Student getStudent(Long IdStudent);

}
