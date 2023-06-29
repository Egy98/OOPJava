package com.example.finalapp2_0.course;


import com.example.finalapp2_0.course.course_service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/Courses")
    public List<Course> getAllCourse() {
        return courseService.getAllCourse();
    }

    @GetMapping("/Courses/{idCourse}")
    public Course getCourse(@PathVariable Long idCourse) {
        return courseService.getCourse(idCourse);
    }

    @PostMapping("/Courses")
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @PutMapping("/Courses/{idCourse}")
    public Course updateCourse(@PathVariable Long idCourse, @RequestBody Course course) {
        if (!idCourse.equals(course.getIdCourse())) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "L'id non corrisponde alla richiesta");
        }
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/Courses/{idCourse}")
    public void deleteCourse(@PathVariable Long idCourse) {
        courseService.deleteCourse(idCourse);
    }
}
