package com.example.tpmapping.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private Date date;
    private Date h_debut;
    private Date h_fin;
    @ManyToMany(mappedBy = "Seance")
    private Collection<Etudiant> etudiants = new ArrayList<>();
    @ManyToOne
    private Cours cours;


}
