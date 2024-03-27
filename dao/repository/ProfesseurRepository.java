package com.example.tpmapping.dao.repository;

import com.example.tpmapping.dao.entities.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesseurRepository extends JpaRepository<Professeur,Long> {
}
