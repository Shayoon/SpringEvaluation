package com.exercice.spring.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
@Entity
@DiscriminatorValue("f")
public class Formateur  extends Person{

    @Column(name = "dateEmbauche")
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateEmbauche;
    @Column(name = "experience")
    private int experience;
    @Column (name = "status")
    private int status;
    @OneToMany
    @JoinColumn(name = "person_id")
    private List<Stagiaire> stagiaires;

    @ManyToMany
    @JoinTable(name = "skill",joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "matiere_id"))
    private List<Matiere> matieres;

    public Formateur() {
    }

    public Formateur(long id, String civilite, String nom, String prenom, String email, Adresse adresse, Date dateEmbauche, int experience, int status, List<Stagiaire> stagiaires, List<Matiere> matieres) {
        super(id, civilite, nom, prenom, email, adresse);
        this.dateEmbauche = dateEmbauche;
        this.experience = experience;
        this.status = status;
        this.stagiaires = stagiaires;
        this.matieres = matieres;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Stagiaire> getStagiaires() {
        return stagiaires;
    }

    public void setStagiaires(List<Stagiaire> stagiaires) {
        this.stagiaires = stagiaires;
    }
}
