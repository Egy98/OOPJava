package com.example.finalapp2_0.istitute;


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
public class Institute {
    @Id
    @GeneratedValue
    private Long idInstitute; // Identificazione dell'istituto
    private String NameInstitute; // Nome dell'istituto
    private String Email; // e-mail dell'istituto
    private Long Tel; // Numero di telefono dell'istituto
    private String City; //Città dell'istituto
    private String Address; //Via dell'istituto
    private String CivicNumber; //Civico dell'istituto
    private int Cap; //CAP dell'istituto
}
