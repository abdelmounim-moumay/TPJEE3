package com.example.tpmapping.dao.repository;

import com.example.tpmapping.dao.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours,Integer> {
}
