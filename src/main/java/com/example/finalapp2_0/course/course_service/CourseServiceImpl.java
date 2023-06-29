package com.example.finalapp2_0.course.course_service;

import com.example.finalapp2_0.course.Course;
import com.example.finalapp2_0.course.CoursesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    private final CoursesRepository coursesRepository;

    public CourseServiceImpl(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    @Override
    public Course createCourse(Course course) {
        return coursesRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return coursesRepository.save(course);
    }

    @Override
    public void deleteCourse(Long idCourse) {
        coursesRepository.deleteById(idCourse);
    }

    @Override
    public List<Course> getAllCourse() {
        return coursesRepository.findAll();
    }

    @Override
    public Course getCourse(Long idCourse) {
        return coursesRepository.findById(idCourse).orElseThrow();
    }
}
