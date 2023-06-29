package com.example.finalapp2_0.Teacher.Service;

import com.example.finalapp2_0.Teacher.Teachers;
import com.example.finalapp2_0.Teacher.TeachersRepository;
import org.springframework.stereotype.Service;

@Service
public class TeachersServiceImp implements TeacherService {

    private final TeachersRepository teachersRepository;

    public TeachersServiceImp(TeachersRepository teachersRepository) {
        this.teachersRepository = teachersRepository;
    }

    @Override
    public Teachers createTeacher(Teachers teachers) {
        return teachersRepository.save(teachers);
    }

    @Override
    public Teachers getTeacher(String fiscalCode) {
        return teachersRepository.findByFiscalCode(fiscalCode);
    }

    @Override
    public Teachers updateTeacher(Teachers teachers) {
        return teachersRepository.save(teachers);
    }

    @Override
    public Teachers deleteTeacher(String fiscalCode) {
        teachersRepository.deleteById(fiscalCode);
        return null;
    }
}
