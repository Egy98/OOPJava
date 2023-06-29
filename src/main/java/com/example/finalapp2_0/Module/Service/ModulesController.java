package com.example.finalapp2_0.Module.Service;

import com.example.finalapp2_0.Module.Modules;
import com.example.finalapp2_0.Module.Service.ModulesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modules")
public class ModulesController {
    private final ModulesService modulesService;

    public ModulesController(ModulesService modulesService) {

        this.modulesService = modulesService;
    }

    @GetMapping
    public List<Modules> getAllModules() {

        return modulesService.findAll();

    }

    @PostMapping
    public Modules createModule(@RequestBody Modules module) {

        return modulesService.save(module);
    }

    @GetMapping("/{id}")
    public Modules getModuleById(@PathVariable Long idModule) {
        return (Modules) modulesService.findById(idModule)
                .orElseThrow(() -> new RuntimeException("Module not found with id: " + idModule));
    }
}
