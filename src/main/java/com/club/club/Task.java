package com.club.club;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "taches")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    @Column(nullable = false)
    private String description;

    @Column
    private boolean statut;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateEcheance;

    @ManyToOne
    @JoinColumn(name = "membre_id", nullable = false)
    private Membre membreAssigne;

    public Task() {}

    public Task(String titre, String description, boolean statut, Date dateEcheance, Membre membreAssigne) {
        this.titre = titre;
        this.description = description;
        this.statut = statut;
        this.dateEcheance = dateEcheance;
        this.membreAssigne = membreAssigne;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", statut='" + statut + '\'' +
                ", dateEcheance=" + dateEcheance +
                ", membreAssigne=" + membreAssigne +
                '}';
    }



public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public Membre getMembreAssigne() {
        return membreAssigne;
    }

    public void setMembreAssigne(Membre membreAssigne) {
        this.membreAssigne = membreAssigne;
    }
}
