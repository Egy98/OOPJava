package com.example.finalapp2_0.assessment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    public class Assessment  {
        @Id
        @GeneratedValue
        private Long idAssessment; //id Voto
        private LocalDate Date; // Data dei voti
        private double Mark; // Voti degli studenti
    }
