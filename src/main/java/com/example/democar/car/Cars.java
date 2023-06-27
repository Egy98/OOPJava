package com.example.democar.car;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Cars {
    @Id
    @GeneratedValue
    private long id;
    private String Brand;
    private String Model;
/*    private String Vendor;
    private int FuelLevel;*/
}
