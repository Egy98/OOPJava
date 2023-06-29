package com.example.finalapp2_0.Institute.Service;

import com.example.finalapp2_0.Institute.Institutes;
import com.example.finalapp2_0.Institute.Service.InstitutesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/institutes")
public class InstitutesController {
    private final InstitutesService institutesService;

    public InstitutesController(InstitutesService institutesService) {
        this.institutesService = institutesService;
    }


    @GetMapping
    public List<Institutes> getAllInstitutes() {
        return institutesService.findAll();
    }

    @PostMapping
    public Institutes createInstitute(@RequestBody Institutes institute) {
        return institutesService.save(institute);
    }
}
