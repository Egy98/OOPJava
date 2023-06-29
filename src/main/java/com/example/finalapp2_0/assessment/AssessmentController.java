package com.example.finalapp2_0.assessment;

import com.example.finalapp2_0.assessment.assessment_service.AssessmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;
@RestController
public class AssessmentController {
    private final AssessmentService assessmentService;

    public AssessmentController(AssessmentService assessmentService) {
        this.assessmentService = assessmentService;
    }

    @GetMapping("/Assessments")
    public List<Assessment> getAllAssessment() {
        return assessmentService.getAllAssessment();
    }

    @GetMapping("/Assessments/{idAssessment}")
    public Assessment getAssessment(@PathVariable Long idAssessment) {
        return assessmentService.getAssessment(idAssessment);
    }

    @PostMapping("/Assessments")
    public Assessment createAssessment(Assessment assessment) {
        return assessmentService.createAssessment(assessment);
    }

    @PutMapping("/Courses/{idAssessment}")
    public Assessment updateAssessment(@PathVariable Long idAssessment, @RequestBody Assessment assessment) {
        if (!idAssessment.equals(assessment.getIdAssessment())) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "L'id non corrisponde alla richiesta");
        }
        return assessmentService.updateAssessment(assessment);
    }

    @DeleteMapping("/Assessments/{idAssessment}")
    public void deleteAssessment(@PathVariable Long idAssessment) {
        assessmentService.deleteAssessment(idAssessment);
    }
}
