package com.example.finalapp2_0.module.module_service;


import com.example.finalapp2_0.module.Module;
import com.example.finalapp2_0.module.ModulesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {

    private final ModulesRepository modulesRepository;

    public ModuleServiceImpl(ModulesRepository modulesRepository) {
        this.modulesRepository = modulesRepository;
    }

    @Override
    public Module createModule(Module module) {
        return modulesRepository.save(module);
    }

    @Override
    public Module updateModule(Module module) {
        return modulesRepository.save(module);
    }

    @Override
    public void deleteModule(Long idModule) {
        modulesRepository.deleteById(idModule);
    }

    @Override
    public List<Module> getAllModule() {
        return modulesRepository.findAll();
    }

    @Override
    public Module getModule(Long idModule) {
        return modulesRepository.findById(idModule).orElseThrow();
    }
}
