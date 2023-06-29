package com.example.finalapp2_0.Student.Service;

import com.example.finalapp2_0.Student.Students;

public interface StudentsService {

    Students createStudent(Students students);

    Students getStudent(String idStudent);

    Students updateStudent(Students students);

    Students deleteStudent(String idStudent);

}
