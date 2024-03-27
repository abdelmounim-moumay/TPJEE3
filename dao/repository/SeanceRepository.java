package com.example.tpmapping.dao.repository;

import com.example.tpmapping.dao.entities.Cours;
import com.example.tpmapping.dao.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository extends JpaRepository<Seance,Integer> {
}
