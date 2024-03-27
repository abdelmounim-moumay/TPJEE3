package com.example.tpmapping.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "personne")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@ToString
public abstract class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long Id;
    private String name;
    private Date date;

}
