package com.example.tpmapping;

import com.example.tpmapping.dao.entities.*;
import com.example.tpmapping.dao.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication

public class TpMappingApplication implements CommandLineRunner {
    @Autowired
    private PersonneRepository personneRepository;
    @Autowired
    private CoursRepository coursRepository;
    @Autowired
    private SeanceRepository seanceRepository;
    @Autowired
    private ProfesseurRepository professeurRepository;
    @Autowired
    private EtudiantRepository etudiantRepository;

    public static void main(String[] args) {
        SpringApplication.run(TpMappingApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Etudiant etudiant = new Etudiant();
        etudiant.setName("ahmed");
        etudiant.setDate(new Date());
        etudiant.setMatricule("5222");
        personneRepository.save(etudiant);

        Professeur professeur = new Professeur();
        professeur.setName("mo");
        professeur.setDate(new Date());
        professeur.setDate_affectation(new Date());
        personneRepository.save(professeur);


        professeur.setCours(new Cours());
        professeur = personneRepository.save(professeur);

        Seance seance = new Seance();
        seance.setDate(new Date());
        seance.setH_fin(new Date());
        seance.setH_debut(new Date());
        seance.setCours(new Cours());
        seance = seanceRepository.save(seance);

        List<Seance> seances  = new ArrayList<>();
        seances.add(seance);
        List<Etudiant> etudiants  = new ArrayList<>();
        etudiants.add(etudiant);
        seance.setEtudiants(etudiants);
        etudiant.setSeances(seances);
        personneRepository.save(etudiant);
        seanceRepository.save(seance);

        System.out.println("le professeur est:");
        List<Professeur>professeurs = professeurRepository.findAll();
        professeurs.forEach(professeur1 -> {
            System.out.println(professeur1.toString());
        });
        System.out.println("Voici les cours");
        List <Cours> cour= coursRepository.findAll();
        cour.forEach(courFromList->{
            System.out.println(courFromList.toString());
        });

        List <Seance> seances1= seanceRepository.findAll();
        seances1.forEach(seanceFromList->{
            System.out.println(seanceFromList.toString());
        });
        Cours updateCours=new Cours();
        updateCours.setTitle("Title2");
        updateCours.setDescription("Description2");
        coursRepository.save(updateCours);
        System.out.println("Voici le cour avand modification");
        System.out.println(updateCours);
        updateCours.setDescription("Desc2");
        coursRepository.save(updateCours);
        System.out.println("Voici le cour aprés modification");
        System.out.println(updateCours);
        Seance seanceDelete = new Seance();
        seanceDelete.setH_fin(new Date());
        seanceDelete.setH_debut(new Date());
        seanceDelete.setDate(new Date());
        seanceRepository.save(seanceDelete);
        System.out.println(seanceRepository.findById(3).get());
        seanceRepository.delete(seanceDelete);
        try {
            System.out.println(seanceRepository.findById(3).get());
        } catch (Exception exception) {
            System.out.println("The seance has been deleted");
        }


    }}
