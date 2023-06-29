package com.example.finalapp2_0.istitute.institute_service;

import com.example.finalapp2_0.istitute.Institute;
import com.example.finalapp2_0.istitute.InstitutesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituteServiceImpl implements InstituteService{

    private final InstitutesRepository institutesRepository;

    public InstituteServiceImpl(InstitutesRepository institutesRepository) {
        this.institutesRepository = institutesRepository;
    }

    @Override
    public Institute createInstitute(Institute institute) {
        return institutesRepository.save(institute);
    }

    @Override
    public Institute updateInstitute(Institute institute) {
        return institutesRepository.save(institute);
    }

    @Override
    public void deleteInstitute(Long idInstitute) {
         institutesRepository.deleteById(idInstitute);
    }

    @Override
    public List<Institute> getAllInstitute() {
        return institutesRepository.findAll();
    }

    @Override
    public Institute getInstitute(Long idInstitute) {
        return institutesRepository.findById(idInstitute).orElseThrow();
    }
}
