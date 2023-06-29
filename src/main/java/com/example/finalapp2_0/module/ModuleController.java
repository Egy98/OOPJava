package com.example.finalapp2_0.module;

import com.example.finalapp2_0.module.module_service.ModuleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
public class ModuleController {
    private final ModuleService moduleService;

    public ModuleController(ModuleService moduleService) {
        this.moduleService = moduleService;
    }

    @GetMapping("/Modules")
    public List<Module> getAllModule() {
        return moduleService.getAllModule();
    }

    @GetMapping("/Modules/{id}")
    public Module getModule(@PathVariable Long idModule) {
        return moduleService.getModule(idModule);
    }

    @PostMapping("/Modules")
    public Module createModule(Module module) {
        return moduleService.createModule(module);
    }

    @PutMapping("/Modules/{id}")
    public Module updateCourse(@PathVariable Long idModule, @RequestBody Module module) {
        if (!idModule.equals(module.getIdModule())) {
            throw new HttpServerErrorException(HttpStatus.BAD_REQUEST, "L'id non corrisponde alla richiesta");
        }
        return moduleService.updateModule(module);
    }

    @DeleteMapping("/Modules/{id}")
    public void deleteModule(@PathVariable Long idModule) {
        moduleService.deleteModule(idModule);
    }
}
