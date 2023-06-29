package com.example.finalapp2_0.assessment.assessment_service;

import com.example.finalapp2_0.assessment.Assessment;

import java.util.List;

public interface AssessmentService {
    Assessment createAssessment(Assessment assessment);
    Assessment updateAssessment(Assessment assessment);
    void deleteAssessment(Long idAssessment);
    List<Assessment> getAllAssessment();
    Assessment getAssessment(Long idAssessment);
}
