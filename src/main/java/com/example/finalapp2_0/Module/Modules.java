package com.example.finalapp2_0.Module;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Modules {
    @Id
    @GeneratedValue
    private Long idModule; //id Modulo (identificazione del Modulo)
    private String ModuleName; // Modulo  (nome del modulo)
    private int Hours; // Ore (ore del corso)
}
