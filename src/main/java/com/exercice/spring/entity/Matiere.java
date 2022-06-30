package com.exercice.spring.entity;

import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "matiere")
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nom")
    @Size(max = 100)
    @NotNull
    private String nom;
    @Column(name = "dure")
    private int dure;
    @Column(name = "difficulte")
    @Size(max=20)
    private String difficulte;
    @ManyToMany(mappedBy = "matieres")
    private List<Formateur> formateurs;

    public Matiere(long id, String nom, int dure, String difficulte, List<Formateur> formateurs) {
        this.id = id;
        this.nom = nom;
        this.dure = dure;
        this.difficulte = difficulte;
        this.formateurs = formateurs;
    }

    public Matiere() {
    }

    public List<Formateur> getFormateurs() {
        return formateurs;
    }

    public void setFormateurs(List<Formateur> formateurs) {
        this.formateurs = formateurs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDure() {
        return dure;
    }

    public void setDure(int dure) {
        this.dure = dure;
    }

    public String getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }
}
