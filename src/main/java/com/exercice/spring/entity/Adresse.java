package com.exercice.spring.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "adresse")
public class Adresse {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "adresse")
    @Size(max = 255)
    @NotNull
    private String adresse;
    @Column(name = "complement")
    @Size(max = 255)
    private String complement;
    @Column(name = "codepostal")
    @Size(max = 10)
    @NotNull
    private String codePostal;
    @Column(name = "ville")
    @Size(max = 100)
    @NotNull
    private String ville;
    @Column(name="pays")
    @Size(max = 100)
    @NotNull
    private String pays;

    public Adresse() {
    }

    public Adresse(long id, String adresse, String complement, String codePostal, String ville, String pays) {
        this.id = id;
        this.adresse = adresse;
        this.complement = complement;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
