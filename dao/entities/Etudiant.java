package com.example.tpmapping.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Etudiant")
public class Etudiant extends Personne{
    private String matricule;
    @ManyToMany(mappedBy = "Etudiant")
    private Collection<Seance>seances = new ArrayList<>();

}
