package com.example.finalapp2_0.Student.Service;

import com.example.finalapp2_0.Student.Students;
import jakarta.persistence.Id;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

public class StudentController {

    private final StudentsService studentsService;

    public StudentController (StudentsService studentsService) {

        this.studentsService = studentsService;

    }

    @GetMapping("/Students/{ IdStudent }")
    public Students getTeacher (@PathVariable String IdStudent) {

        return studentsService.getStudent(IdStudent);
    }

    @PostMapping("/Teachers/")
    public Students createStudent (@RequestBody Students students){

        return studentsService.createStudent(students);

    }

    @PutMapping("/Students/{ IdStudent }")
    Students updateStudent(@PathVariable String IdStudent, @RequestBody Students students) {
        if(!IdStudent.equals(students.getIdStudent())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Bad ID utilisation");
        } else {
            return studentsService.updateStudent(students);
        }
    }

    @DeleteMapping("/Students/{ IdStudent }")
    public void deleteStudent(@PathVariable String IdStudent) {

        studentsService.deleteStudent(IdStudent);
    }


}
