package com.example.finalapp2_0.Module.Service;

import com.example.finalapp2_0.Module.Modules;

import java.util.List;
import java.util.Optional;

public interface ModulesService {

    List<Modules> findAll();

    Module createModule(Module module);

    Modules createModule(Modules module);

    Modules getModule(Long idModule);

    Module updateModule(Module module);

    Modules updateModule(Modules module);

    Module deleteModule(Long idModule);

    Modules save(Modules module);

    Optional<Object> findById(Long idModule);

}
