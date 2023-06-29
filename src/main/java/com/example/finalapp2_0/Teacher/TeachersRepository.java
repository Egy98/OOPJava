package com.example.finalapp2_0.Teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface TeachersRepository extends JpaRepository<Teachers, String> {

    @Query("select t from Teachers t where t.FiscalCode = ?1")
    Teachers findByFiscalCode(String fiscalCode);
}
