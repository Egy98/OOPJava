package com.example.finalapp2_0.Student;


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

public class Students {
    @Id
    @GeneratedValue
    private String IdStudent; //Id (matricola)
    private String Name; //Nome
    private String Surname; //Cognome
    private String email; //Email
    private int Marks; //Voti
    private String StudyGrade; //Titolo di studio
    private int Presence; //Presenze
    private int Absence; //Assenze
    private LocalDate birthDate; //Data di nascita
    private double Average; //Media
    private String Certifications; //Certificazioni
    public String Course; //Orari corso che può consultare
}
