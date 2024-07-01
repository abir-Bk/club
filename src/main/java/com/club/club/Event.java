package com.club.club;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "evenements")

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String nom;
    @Column
    private String description;
    @Column
    private Date date;
    @Column
    private String lieu;

    public Event() {}

    public Event(String nom, String description, Date date, String lieu) {
        this.nom = nom;
        this.description = description;
        this.date = date;
        this.lieu = lieu;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
