package com.example.tpmapping.dao.repository;

import com.example.tpmapping.dao.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
