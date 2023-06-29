package com.example.finalapp2_0.Assessment.Service;

import com.example.finalapp2_0.Assessment.Assessments;

import java.util.List;

public interface AssessmentsService {
    Assessments createAssessment(Assessments assessments);

    Assessments getAssessment(Long idAssessment);

    Assessments updateAssessment(Assessments assessments);

    void deleteAssessment(Long idAssessment);

    List<Assessments> getAll();

    List<Assessments> addAll();
}
