package com.example.finalapp2_0.teacher.teacher_service;

import com.example.finalapp2_0.teacher.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher createTeacher(Teacher teacher);

    Teacher updateTeacher(Teacher teacher);


    void deleteTeacher(String FiscalCode);

    List<Teacher> getAllTeacher();
    Teacher getTeacher(String FiscalCode);
}

