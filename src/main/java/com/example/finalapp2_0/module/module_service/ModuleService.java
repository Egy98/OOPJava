package com.example.finalapp2_0.module.module_service;


import com.example.finalapp2_0.module.Module;

import java.util.List;

public interface ModuleService {
    Module createModule(Module module);
    Module updateModule(Module module);
    void deleteModule(Long idModule);
    List<Module> getAllModule();
    Module getModule(Long idModule);
}
