package com.example.finalapp2_0.Course.Service;

import com.example.finalapp2_0.Course.Courses;

import java.util.List;
import java.util.Optional;

public interface CoursesService {
    Courses createCourse(Courses courses);

    Courses getCourse(Long idCourse);

    Courses updateCourse(Courses courses);

    Courses deleteCourse(Long idCourse);

    List<Courses> findAll();

    Courses save(Courses course);

    Optional<Object> findById(Long idCourse);
}
