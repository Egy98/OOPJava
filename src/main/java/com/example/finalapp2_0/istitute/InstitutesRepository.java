package com.example.finalapp2_0.istitute;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutesRepository extends JpaRepository<Institute, Long> {
}
