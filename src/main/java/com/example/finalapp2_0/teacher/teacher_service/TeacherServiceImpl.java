package com.example.finalapp2_0.course.course_service;

import com.example.finalapp2_0.course.Course;
import com.example.finalapp2_0.teacher.Teacher;
import com.example.finalapp2_0.teacher.TeachersRepository;
import com.example.finalapp2_0.teacher.teacher_service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {


    private final TeachersRepository teachersRepository;

    public TeacherServiceImpl(TeachersRepository teachersRepository) {
        this.teachersRepository = teachersRepository;
    }


    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teachersRepository.save(teacher);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teachersRepository.save(teacher);
    }

    @Override
    public void deleteTeacher(String FiscalCode) {
        teachersRepository.deleteById(FiscalCode);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teachersRepository.findAll();
    }

    @Override
    public Teacher getTeacher(String FiscalCode) {
        return teachersRepository.findById(FiscalCode).orElseThrow();
    }
}
