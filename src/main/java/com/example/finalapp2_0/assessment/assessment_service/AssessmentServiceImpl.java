package com.example.finalapp2_0.assessment.assessment_service;

import com.example.finalapp2_0.assessment.Assessment;
import com.example.finalapp2_0.assessment.AssessmentsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssessmentServiceImpl implements AssessmentService{
    private final AssessmentsRepository assessmentsRepository;

    public AssessmentServiceImpl(AssessmentsRepository assessmentsRepository) {
        this.assessmentsRepository = assessmentsRepository;
    }

    @Override
    public Assessment createAssessment(Assessment assessment) {
        return assessmentsRepository.save(assessment);
    }

    @Override
    public Assessment updateAssessment(Assessment assessment) {
        return assessmentsRepository.save(assessment);
    }

    @Override
    public void deleteAssessment(Long idAssessment) {
        assessmentsRepository.deleteById(idAssessment);
    }

    @Override
    public List<Assessment> getAllAssessment() {
        return  assessmentsRepository.findAll();
    }

    @Override
    public Assessment getAssessment(Long idAssessment) {
        return assessmentsRepository.findById(idAssessment).orElseThrow();
    }
}
