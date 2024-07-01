package com.club.club;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "membres")
public class Membre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String cin;
    @Column
    private String password;

    @OneToMany(mappedBy = "membreAssigne", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task> taches = new ArrayList<>();

    public Membre() {}

    public Membre(String nom, String prenom, String cin, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Task> getTaches() {
        return taches;
    }

    public void setTaches(List<Task> taches) {
        this.taches = taches;
    }

    public void addTache(Task task) {
        taches.add(task);
        task.setMembreAssigne(this);
    }

    public void removeTache(Task task) {
        taches.remove(task);
        task.setMembreAssigne(null);
    }
}
