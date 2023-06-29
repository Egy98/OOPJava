package com.example.finalapp2_0.Teacher;

import jakarta.persistence.Entity;
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

public class Teachers {
    @Id
    private String FiscalCode; // ID (Codice Fiscale)
    private String Name; // Nome
    private String Surname; // Cognome
    private int PhoneNumber; //Numero di telefono
    private String Email; //Email
    private String Adress; //Indirizzo
    private String Subject; // Materia
}
