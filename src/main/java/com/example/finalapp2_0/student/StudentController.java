package com.example.finalapp2_0.student;

import com.example.finalapp2_0.student.student_service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/Students")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping("/Students/{idStudent}")
    public Student getStudent(@PathVariable Long idStudent) {
        return studentService.getStudent(idStudent);
    }

    @PostMapping("/Students")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/Students/{idStudent}")
    public Student updateStudent(@PathVariable Long idStudent, @RequestBody Student student) {
        if (!idStudent.equals(student.getIdStudent())) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "L'id non corrisponde alla richiesta");
        }
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/Students/{idStudent}")
    public void deleteStudent(@PathVariable Long idStudent) {
        studentService.deleteStudent(idStudent);
    }
}
