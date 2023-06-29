package com.example.finalapp2_0.Assessment;

import com.example.finalapp2_0.Assessment.Service.AssessmentsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssessmentController {
    private final AssessmentsService assessmentsService;

    public AssessmentController(AssessmentsService assessmentsService) {
        this.assessmentsService = assessmentsService;
    }

    @PostMapping ("/Assessment")
    public List<Assessments> createAssessment() {
        return assessmentsService.addAll();
    }

    @GetMapping("/Assessment")
    public List<Assessments> getAssessment() {
        return assessmentsService.getAll();
    }

    @GetMapping("/Assessment/{id}")
    public Assessments getAssessment(@PathVariable long idAssessment, @RequestParam("lang") String lang) {
        return assessmentsService.getAssessment(idAssessment);
    }

}
