package com.example.finalapp2_0.Assessment.Service;

import com.example.finalapp2_0.Assessment.Assessments;
import com.example.finalapp2_0.Assessment.AssessmentsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentsServiceImp implements AssessmentsService {

    private final AssessmentsRepository assessmentsRepository;

    public AssessmentsServiceImp(AssessmentsRepository assessmentsRepository) {
        this.assessmentsRepository = assessmentsRepository;
    }

    @Override
    public Assessments createAssessment(Assessments assessments) {

        return assessmentsRepository.save(assessments);
    }

    @Override
    public Assessments getAssessment(Long idAssessment) {

        return assessmentsRepository.getReferenceById(idAssessment);
    }

    @Override
    public Assessments updateAssessment(Assessments assessments) {

        return assessmentsRepository.save(assessments);
    }

    @Override
    public void deleteAssessment(Long idAssessment) {

         assessmentsRepository.deleteById(idAssessment);
    }

    @Override
    public List<Assessments> getAll() {
        return getAll();
    }

    @Override
    public List<Assessments> addAll() {
        return addAll();
    }
}
