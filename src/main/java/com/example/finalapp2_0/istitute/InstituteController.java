package com.example.finalapp2_0.istitute;

import com.example.finalapp2_0.istitute.institute_service.InstituteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class InstituteController {
    private final InstituteService instituteService;

    public InstituteController(InstituteService instituteService) {
        this.instituteService = instituteService;
    }

    @GetMapping("/Institutes")
    public List<Institute> getAllInstitute() {
        return instituteService.getAllInstitute();
    }

    @GetMapping("/Institutes/{id}")
    public Institute getInstitute(@PathVariable Long idInstitute) {
        return instituteService.getInstitute(idInstitute);
    }

    @PostMapping("/Institutes")
    public Institute createInstitute(Institute institute) {
        return instituteService.createInstitute(institute);
    }

    @PutMapping("/Institutes/{id}")
    public Institute updateInstitute(@PathVariable Long idInstitute, @RequestBody Institute institute) {
        if (!idInstitute.equals(institute.getIdInstitute())) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "L'id non corrisponde alla richiesta");
        }
        return instituteService.updateInstitute(institute);
    }

    @DeleteMapping("/Institutes/{id}")
    public void deleteInstitute(@PathVariable Long idIstitute) {
        instituteService.deleteInstitute(idIstitute);
    }
}
