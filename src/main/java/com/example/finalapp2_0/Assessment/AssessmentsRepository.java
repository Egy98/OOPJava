package com.example.finalapp2_0.Assessment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentsRepository extends JpaRepository<Assessments, Long> {
}
