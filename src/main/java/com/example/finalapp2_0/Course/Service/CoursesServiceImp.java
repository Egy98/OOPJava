package com.example.finalapp2_0.Course.Service;

import com.example.finalapp2_0.Course.Courses;
import com.example.finalapp2_0.Course.CoursesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursesServiceImp implements CoursesService {

    private final CoursesRepository coursesRepository;

    public CoursesServiceImp(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }


    @Override
    public Courses createCourse(Courses courses) {

        coursesRepository.save(courses);
        return null;
    }

    @Override
    public Courses getCourse(Long idCourse) {

        coursesRepository.getReferenceById(idCourse);
        return null;
    }

    @Override
    public Courses updateCourse(Courses courses) {

       coursesRepository.save(courses);
       return null;
    }

    @Override
    public Courses deleteCourse(Long idCourse) {

        coursesRepository.deleteById(idCourse);
        return null;
    }

    @Override
    public List<Courses> findAll() {
        return null;
    }

    @Override
    public Courses save(Courses course) {
        return null;
    }

    @Override
    public Optional<Object> findById(Long idCourse) {
        return Optional.empty();
    }
}
