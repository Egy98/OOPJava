package com.example.finalapp2_0.Teacher.Service;

import com.example.finalapp2_0.Teacher.Teachers;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

@RestController
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/Teachers/{fiscalCode}")
    public Teachers getTeacher(@PathVariable String fiscalCode) {
        return teacherService.getTeacher(fiscalCode);
    }

    @PostMapping("/Teachers")
    public Teachers createTeacher(@RequestBody Teachers teachers) {
        return teacherService.createTeacher(teachers);
    }

    @PutMapping("/Teachers/{fiscalCode}")
    public Teachers updateTeacher(@PathVariable String fiscalCode, @RequestBody Teachers updatedTeacher) {
        if (!fiscalCode.equals(updatedTeacher.getFiscalCode())) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Bad ID utilization");
        } else {
            return teacherService.updateTeacher(updatedTeacher);
        }
    }

    @DeleteMapping("/Teachers/{fiscalCode}")
    public void deleteTeacher(@PathVariable String fiscalCode) {
        teacherService.deleteTeacher(fiscalCode);
    }
}
