package com.example.tpmapping.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "professeur")
public class Professeur extends Personne{
    private Date date_affectation;
    @OneToOne(mappedBy = "professeur")
    private Cours cours;

}
