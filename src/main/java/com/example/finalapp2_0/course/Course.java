package com.example.finalapp2_0.course;

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
public class Course {
    @Id
    @GeneratedValue
    private Long idCourse; //id
    private int NumberofPartecipant; //Numero di partecipanti
    private String courseAdress; //Indirizzo del corso
    private int Duration; //Durata del corso (anni)
    private String CertificationRelease; //Rilascio certificazione
}
