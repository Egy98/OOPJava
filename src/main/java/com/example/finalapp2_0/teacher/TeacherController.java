package com.example.finalapp2_0.teacher;

import com.example.finalapp2_0.teacher.teacher_service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }



        @GetMapping("/Teachers")
        public List<Teacher> getAllTeacher() {
            return teacherService.getAllTeacher();
        }

        @GetMapping("/Teachers/{FiscalCode}")
        public Teacher getTeacher(@PathVariable String FiscalCode) {
            return teacherService.getTeacher(FiscalCode);
        }

        @PostMapping("/Teachers")
        public Teacher createTeacher(@RequestBody Teacher teacher) {
            return teacherService.createTeacher(teacher);
        }

        @PutMapping("/Teachers/{FiscalCode}")
        public Teacher updateTeacher(@PathVariable String FiscalCode, @RequestBody Teacher teacher) {
            if (!FiscalCode.equals(teacher.getFiscalCode())) {
                throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Il FiscalCode non corrisponde alla richiesta");
            }
            return teacherService.updateTeacher(teacher);
        }

        @DeleteMapping("/Courses/{FiscalCode}")
        public void deleteTeacher(@PathVariable String FiscalCode) {
            teacherService.deleteTeacher(FiscalCode);
        }
    }
