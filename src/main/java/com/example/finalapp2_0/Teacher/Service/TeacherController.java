package com.example.finalapp2_0.Teacher.Service;

import com.example.finalapp2_0.Teacher.Teachers;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController (TeacherService teacherService) {

        this.teacherService = teacherService;
    }

    @GetMapping("/Teachers/{ FiscalCode }")
    public Teachers getTeacher (@PathVariable String FiscalCode) {

        return teacherService.getTeacher(FiscalCode);
    }

    @PostMapping("/Teachers/")
    public Teachers createTeacher (@RequestBody Teachers teachers){

        return teacherService.createTeacher(teachers);
    }

    @PutMapping("/Teachers/{ i }")
    Teachers updateTeacher(@PathVariable String FiscalCode, @RequestBody Teachers teachers) {
        if(!FiscalCode.equals(teachers.getFiscalCode())){
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "Bad ID utilisation");
        } else {
            return teacherService.updateTeacher(teachers);
        }
    }
    @DeleteMapping("/Teachers/{ id }")
    public void deleteTeacher(@PathVariable String FiscalCode){
        teacherService.deleteTeacher(FiscalCode);
    }


}
