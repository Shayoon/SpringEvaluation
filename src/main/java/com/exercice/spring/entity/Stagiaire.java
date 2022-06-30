package com.exercice.spring.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("s")
public class Stagiaire extends Person {
    @Column
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @ManyToOne
    private Formateur formateur;

    public Stagiaire() {
    }

    public Stagiaire(long id, String civilite, String nom, String prenom, String email, Adresse adresse, Date dateNaissance, Formateur formateur) {
        super(id, civilite, nom, prenom, email, adresse);
        this.dateNaissance = dateNaissance;
        this.formateur = formateur;
    }
}
