package com.example.finalapp2_0.Institute.Service;

import com.example.finalapp2_0.Institute.Institutes;
import com.example.finalapp2_0.Institute.InstitutesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutesServiceImp implements InstitutesService {

    private final InstitutesRepository institutesRepository;

    public InstitutesServiceImp(InstitutesRepository institutesRepository) {
        this.institutesRepository = institutesRepository;
    }

    @Override
    public Institutes createInstitute(Institutes institutes) {
        return institutesRepository.save(institutes);
    }

    @Override
    public Institutes getInstitute(String idInstitute) {
        return institutesRepository.findById(idInstitute)
                .orElseThrow(() -> new RuntimeException("Institute not found with id: " + idInstitute));
    }

    @Override
    public Institutes updateInstitute(Institutes institutes) {
        return institutesRepository.save(institutes);
    }

    @Override
    public Institutes deleteInstitute(String idInstitute) {
        institutesRepository.deleteById(idInstitute);
        return null;
    }

    @Override
    public List<Institutes> findAll() {
        return institutesRepository.findAll();
    }

    @Override
    public Institutes save(Institutes institute) {
        return null;
    }
}
