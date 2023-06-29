package com.example.finalapp2_0.Module.Service;

import com.example.finalapp2_0.Module.Modules;
import com.example.finalapp2_0.Module.ModulesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModulesServiceImp implements ModulesService {

    private final ModulesRepository modulesRepository;

    public ModulesServiceImp(ModulesRepository modulesRepository) {
        this.modulesRepository = modulesRepository;
    }

    @Override
    public Modules createModule(Modules module) {
        return modulesRepository.save(module);
    }

    @Override
    public Modules getModule(Long idModule) {
        return modulesRepository.findById(idModule)
                .orElseThrow(() -> new RuntimeException("Module not found with id: " + idModule));
    }

    @Override
    public Module updateModule(Module module) {
        return null;
    }

    @Override
    public Modules updateModule(Modules module) {
        return modulesRepository.save(module);
    }

    @Override
    public Module deleteModule(Long idModule) {
        modulesRepository.deleteById(idModule);
        return null;
    }

    @Override
    public Modules save(Modules module) {
        return null;
    }


    @Override
    public Optional<Object> findById(Long idModule) {
        return Optional.empty();
    }

    @Override
    public List<Modules> findAll() {
        return modulesRepository.findAll();
    }

    @Override
    public Module createModule(Module module) {
        return null;
    }
}
