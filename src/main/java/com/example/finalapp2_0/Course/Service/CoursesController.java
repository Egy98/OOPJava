package com.example.finalapp2_0.Course.Service;

import com.example.finalapp2_0.Course.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    private final CoursesService coursesService;

    @Autowired
    public CoursesController(CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    @GetMapping
    public List<Courses> getAllCourses() {
        return coursesService.findAll();
    }

    @PostMapping
    public Courses createCourse(@RequestBody Courses course) {
        return coursesService.save(course);
    }

    @GetMapping("/{id}")
    public Courses getCourseById(@PathVariable Long idCourse) {
        return (Courses) coursesService.findById(idCourse)
                .orElseThrow(() -> new RuntimeException("Corso non trovato con questo id: " + idCourse));
    }
}
