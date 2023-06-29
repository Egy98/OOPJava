package com.example.finalapp2_0.istitute.institute_service;

import com.example.finalapp2_0.istitute.Institute;

import java.util.List;

public interface InstituteService {

    Institute createInstitute(Institute institute);

    Institute updateInstitute(Institute institute);
    void deleteInstitute(Long idInstitute);
    List<Institute> getAllInstitute();
    Institute getInstitute(Long idInstitute);

}
