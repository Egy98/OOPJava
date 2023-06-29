package com.example.finalapp2_0.teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface TeachersRepository extends JpaRepository<Teacher, String> {

    @Query("select t from Teacher t where t.FiscalCode = ?1")
    Teacher findByFiscalCode(String fiscalCode);
}
