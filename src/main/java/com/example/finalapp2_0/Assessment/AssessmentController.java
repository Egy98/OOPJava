package com.example.finalapp2_0.Assessment;

import com.example.finalapp2_0.Assessment.Service.AssessmentsService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AssessmentController {
    private final AssessmentsService assessmentsService;

    public AssessmentController(AssessmentsService assessmentsService) {
        this.assessmentsService = assessmentsService;
    }


    @GetMapping("/Assessment")
        public List<Assessments> getAssessment() {
            return assessmentsService.getAll();
        }

        @GetMapping("/Assessment{id}")
        public Assessments getAssessment(@PathVariable long idAssessment, @PathParam("lang") String lang) {
            return assessmentsService.getAssessment(idAssessment);
        }

}
