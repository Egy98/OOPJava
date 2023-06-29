package com.example.finalapp2_0.Teacher.Service;

import com.example.finalapp2_0.Student.Students;
import com.example.finalapp2_0.Teacher.Teachers;

public interface TeacherService {

    Teachers createTeacher(Teachers teachers);

    Teachers getTeacher(String idTeacher);

    Teachers updateTeacher(Teachers teachers);

    Teachers deleteTeacher(String idTeacher);

}
