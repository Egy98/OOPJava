package com.example.finalapp2_0.course.course_service;

import com.example.finalapp2_0.course.Course;

import java.util.List;

public interface CourseService {
    Course createCourse(Course course);

    Course updateCourse(Course course);
    void deleteCourse(Long idCourse);
    List<Course> getAllCourse();
    Course getCourse(Long idCourse);
}
