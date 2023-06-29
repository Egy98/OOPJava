package com.example.finalapp2_0.Institute;


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
public class Institutes {
    @Id
    @GeneratedValue
    private String idInstitute; // Identificazione dell'istituto
    private String NameInstitute; // Nome dell'istituto
    private String Email; // e-mail dell'istituto
    private String Tel; // Numero di telefono dell'istituto
    private String City; //Città dell'istituto
    private String Address; //Via dell'istituto
    private String CivicNumber; //Civico dell'istituto
    private int Cap; //CAP dell'istituto


}
