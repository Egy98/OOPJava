package com.example.finalapp2_0.student.student_service;

import com.example.finalapp2_0.student.Student;
import com.example.finalapp2_0.student.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long IdStudent) {
        studentRepository.deleteById(IdStudent);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Long IdStudent) {
        return studentRepository.findById(IdStudent).orElseThrow();
    }
}
