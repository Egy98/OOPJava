package com.example.finalapp2_0.Institute.Service;

import com.example.finalapp2_0.Institute.Institutes;

import java.util.List;

public interface InstitutesService {
    Institutes createInstitute(Institutes module);

    Institutes getInstitute(String idInstitute);

    Institutes updateInstitute(Institutes module);

    Institutes deleteInstitute(String idInstitute);

    List<Institutes> findAll();

    Institutes save(Institutes institute);
}
