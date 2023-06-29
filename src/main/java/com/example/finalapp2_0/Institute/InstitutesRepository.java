package com.example.finalapp2_0.Institute;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutesRepository extends JpaRepository<Institutes, String> {

}
