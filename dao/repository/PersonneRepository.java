package com.example.tpmapping.dao.repository;

import com.example.tpmapping.dao.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
