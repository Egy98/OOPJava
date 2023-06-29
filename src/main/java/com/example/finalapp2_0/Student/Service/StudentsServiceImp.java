package com.example.finalapp2_0.Student.Service;


import com.example.finalapp2_0.Student.Students;
import com.example.finalapp2_0.Student.StudentsRepository;
import org.springframework.stereotype.Service;



@Service
public class StudentsServiceImp implements StudentsService {

    private final StudentsRepository studentsRepository;

    public StudentsServiceImp(StudentsRepository studentsRepository) {

        this.studentsRepository = studentsRepository;
    }


    @Override
    public Students createStudent(Students students) {

        return studentsRepository.save(students);
    }

    @Override
    public Students getStudent(String idStudent) {

        return studentsRepository.getReferenceById(idStudent);
    }

    @Override
    public Students updateStudent(Students students) {

        return studentsRepository.save(students);
    }

    @Override
    public Students deleteStudent(String idStudent) {
        studentsRepository.deleteById(idStudent);
        return null;
    }
}
